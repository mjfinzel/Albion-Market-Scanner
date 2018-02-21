package program;


import java.awt.AWTException;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JPanel;



public class GamePanel extends JPanel{
	public static int currentWindow = 0;
	public static String baseDirectory = "";

	public static boolean paused = false;

	static Point mousePos = new Point(-1,-1);

	static Robot robot;

	static final int DISPLAY_LISTINGS = 0;
	static final int DISPLAY_OPPORTUNITIES = 1;

	static int state = DISPLAY_LISTINGS;

	public static long startTime = System.currentTimeMillis();

	public ArrayList<BufferedImage> knownCharacters = new ArrayList<BufferedImage>();

	public static ArrayList<Listing> listings = new ArrayList<Listing>();
	//public static HashMap<String, Listing> listings = new HashMap<String, Listing>();
	public static BufferedImage black_market = Images.loadLocal("/screenshots/Caerleon.png");
	public static BufferedImage caerleon = Images.loadLocal("/screenshots/Caerleon_Market.png");

	public static String currentCity = "None";

	OCR ocr;

	public GamePanel(){
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!System.getProperty("os.name").contains("Windows")){
			//linux
			try {
				baseDirectory = AppletUI.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//remove the final location from the path
			for(int i = baseDirectory.length()-1;i>=0;i--){
				if((baseDirectory.charAt(i)+"").equals(File.separator)){
					baseDirectory = baseDirectory.substring(0, i);
					break;
				}
			}
			baseDirectory = baseDirectory+File.separator+"AlbionMarketTool_Saves";
		}
		else{
			baseDirectory = System.getenv("APPDATA")+File.separator+"AlbionMarketTool_Saves";

		}


		//		String inputPath = baseDirectory+"/characters/'";
		//		System.out.println(baseDirectory);
		//
		//		knownCharacters.clear();
		//		File folder = new File(inputPath);
		//		File[] listOfFiles = folder.listFiles();
		//		ArrayList<BufferedImage> possibleChars = new ArrayList<BufferedImage>();
		//
		//		for (int i = 0; i < listOfFiles.length; i++) {		
		//			if (listOfFiles[i].isFile()) {
		//
		//				String pathToQuestion = inputPath+"/"+listOfFiles[i].getName();
		//
		//				possibleChars.add(Images.load(pathToQuestion));
		//
		//
		//			}
		//		}
		//
		//		for(int i = 0; i<possibleChars.size();i++){
		//			BufferedImage current = scaleImage(trimTopAndBottom(possibleChars.get(i)));
		//			if(!alreadyKnown(current)){
		//				knownCharacters.add(current);
		//				saveBufferedImage(current, inputPath +"/cleaned/"+ knownCharacters.size()+".png");
		//			}
		//		}
		ocr = new OCR();
	}
	public static ArrayList<BufferedImage> loadImages(String path){
		System.out.println(path);
		ArrayList<BufferedImage> result = new ArrayList<BufferedImage>();

		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {		
			if (listOfFiles[i].isFile()) {

				String pathToQuestion = path+"/"+listOfFiles[i].getName();

				result.add(Images.load(pathToQuestion));


			}
		}
		return result;
	}
	public boolean alreadyKnown(BufferedImage img){
		for(int i = 0; i<knownCharacters.size();i++){
			boolean found = true;
			for(int x = 0; x<img.getWidth();x++){
				for(int y = 0; y<img.getHeight(); y++){
					if(img.getRGB(x, y) != knownCharacters.get(i).getRGB(x, y)){
						found = false;
					}
				}
			}
			if(found){
				return true;
			}
		}
		return false;
	}
	public int totalBlack(BufferedImage img){
		int tot = 0;
		for(int x = 0; x<img.getWidth();x++){
			for(int y = 0; y<img.getHeight();y++){
				if(img.getRGB(x, y) == Color.black.getRGB()){
					tot++;
				}
			}
		}
		return tot;
	}

	static int randomNumber(int min, int max){
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	public static void click(int x, int y){
		//System.out.println("attempting click at: "+x+","+y);
		mousePos.x = x;
		mousePos.y = y;
		robot.mouseMove(x,y);
		sleep(70, 150);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		sleep(80, 110);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		sleep(80, 110);
		robot.mouseMove(randomNumber(1200,1500), randomNumber(352, 900));
		mousePos = MouseInfo.getPointerInfo().getLocation();
		sleep(200,300);
	}

	public static void sleep(int min, int max){
		try {
			Thread.sleep(randomNumber(min, max));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Point p = MouseInfo.getPointerInfo().getLocation();
		if(mousePos.x>0 && mousePos.y>0){
			if(Math.abs(p.x - mousePos.x)>580 || Math.abs(p.y - mousePos.y)>580){
				paused = true;
				System.out.println("paused (mouse was moved)");
			}
		}
		Draw(g);
	}

	public ArrayList<BufferedImage> isolateCharacters(BufferedImage img){
		ArrayList<BufferedImage> results = new ArrayList<BufferedImage>();
		//threshold
		int t = 160;

		int start = -1;

		for(int x = 0; x<img.getWidth(); x++){
			boolean verticalHadBlack = false;
			for(int y = 0; y<img.getHeight(); y++){
				Color curr = new Color(img.getRGB(x, y), true);
				//white
				if(curr.getRed()<t&&curr.getGreen()<t&&curr.getBlue()<t){
					img.setRGB(x, y, Color.white.getRGB());

				}
				//black
				else{
					img.setRGB(x, y, Color.black.getRGB());
					verticalHadBlack=true;
					if(start==-1)
						start=x;
				}

			}
			if(start!=-1&&verticalHadBlack==false){
				results.add(img.getSubimage(start, 0, x-start, img.getHeight()));
				//System.out.println(x-start);
				start=-1;
			}

		}
		return results;
	}

	public ArrayList<BufferedImage> isolateLines(BufferedImage img){
		ArrayList<BufferedImage> results = new ArrayList<BufferedImage>();
		int t = 160;
		int start = -1;
		for(int y = 0; y<img.getHeight(); y++){
			boolean hadBlack = false;
			for(int x = 0; x<img.getWidth(); x++){
				Color curr = new Color(img.getRGB(x, y), true);
				//white
				if(curr.getRed()<t&&curr.getGreen()<t&&curr.getBlue()<t){

				}
				//black
				else{
					hadBlack=true;
					if(start==-1)
						start=y;
					break;
				}
			}
			if(start!=-1&&hadBlack==false){
				results.add(img.getSubimage(0, start, img.getWidth(), y-start));
				start=-1;
			}
		}
		return results;
	}
	public BufferedImage trimTopAndBottom(BufferedImage img){
		int start = -1;
		int end = -1;
		for(int y = 0; y<img.getHeight(); y++){
			for(int x = 0; x<img.getWidth(); x++){
				Color curr = new Color(img.getRGB(x, y), true);

				if(curr.getRGB()==Color.black.getRGB()){
					if(start==-1)
						start=y;
					break;
				}

			}
			if(start!=-1)
				break;
		}
		for(int y = img.getHeight()-1; y>=start; y--){
			for(int x = 0; x<img.getWidth(); x++){

				Color curr = new Color(img.getRGB(x, y), true);
				if(curr.getRGB()==Color.black.getRGB()){
					return img.getSubimage(0, start, img.getWidth(), (y+1)-start);
				}

			}
		}
		return img;
	}
	public static void saveBufferedImage(BufferedImage img, String pathToImage){

		System.out.println("Saving image to: "+pathToImage);

		File outputfile = new File(pathToImage);
		outputfile.mkdirs();
		try {
			ImageIO.write(img, "png", outputfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public BufferedImage scaleImage(BufferedImage img){

		BufferedImage result = new BufferedImage(20, 20, img.getType());
		Graphics g = result.getGraphics();
		g.drawImage(img, 0, 0, 20, 20, null);
		return result;
	}

	public boolean imagesAreSame(BufferedImage a, BufferedImage b){
		//same dimensions
		if(b.getWidth()==a.getWidth() && b.getHeight() == a.getHeight()){
			for(int x = 0; x<b.getWidth();x++){
				for(int y = 0; y<b.getHeight(); y++){
					if(b.getRGB(x, y)!=a.getRGB(x, y)){
						return false;
					}
				}
			}

		}
		else{
			return false;
		}
		return true;
	}
	public void addListing(Listing listing){
		if(listing.city=="None" || listing.price<0){
			return;
		}
		//check if the listing already exists
		for(int i = 0; i<listings.size(); i++){
			//same name
			if(listings.get(i).name.equals(listing.name)){
				//same city
				if(listings.get(i).city.equals(listing.city)){
					//same price
					if(listings.get(i).price==listing.price){
						//more than 1 minute old
						if(listing.age>listings.get(i).age+60000){
							listings.set(i, listing);
						}
						return;
					}
				}
			}
		}
		//if the listing doesn't already exist
		listings.add(listing);
		//System.out.println(listing.name + ","+listing.price +","+ listing.quantity + ","+listing.city);
	}
	public ArrayList<Opportunity> getOpportunities(){
		ArrayList<Opportunity> result = new ArrayList<Opportunity>();
		for(int i = 0; i<listings.size(); i++){
			for(int j = 0; j<listings.size(); j++){
				//if both listings have the same name but different cities
				if(listings.get(i).name==listings.get(j).name && listings.get(i).city != listings.get(j).city){
					if(listings.get(i).price>listings.get(j).price && listings.get(j).city!="BlackMarket"){
						int quantity = Math.min(listings.get(i).quantity, listings.get(j).quantity);
						double cost = listings.get(j).price * quantity;
						double value = listings.get(i).price * quantity;
						double profit = value/cost;
						result.add(new Opportunity(listings.get(j), listings.get(i), profit));
					}
				}
			}
		}
		return result;
	}
	public void Draw(Graphics g){

		mousePos = MouseInfo.getPointerInfo().getLocation();
		if(paused==false){
			//Determine what city the player is in
			BufferedImage city = robot.createScreenCapture(new Rectangle(1670, 1038, 170, 24));
			if(imagesAreSame(city, caerleon)){
				currentCity = "Caerleon";
			}
			else if(imagesAreSame(city, black_market)){
				currentCity = "BlackMarket";
			}
			//g.drawString(currentCity, 40, 400);

			//Take a screenshot of the window
			BufferedImage window = robot.createScreenCapture(new Rectangle(520, 420, 670, 380));
			
			//return early if this is a loading screen
			if(new Color(window.getRGB(960-520, 518-420)).getGreen()>190) return;

			for(int i = 0; i<5; i++){
				//name
				ArrayList<BufferedImage> nameChars = new ArrayList<BufferedImage>();
				ArrayList<BufferedImage> nameLines = isolateLines(window.getSubimage(80, i*83, 157, 46));

				//g.drawImage(window.getSubimage(80, i*83, 157, 46), 10, i*83, null);
				for(int j = 0; j<nameLines.size();j++){
					ArrayList<BufferedImage>isolatedChars = isolateCharacters(nameLines.get(j));

					for(int k = 0; k< isolatedChars.size(); k++){
						nameChars.add(trimTopAndBottom(isolatedChars.get(k)));
					}
				}
				String text = "";
				for(int j = 0; j<nameChars.size();j++){
					//g.drawImage(scaleImage(nameChars.get(j)), j*21, i*83, null);
					text += ocr.readImageText(scaleImage(nameChars.get(j)));
				}
				text = ocr.getNameFromOCR(text);
				Font font = new Font("Iwona Heavy",Font.BOLD,18);
				g.setFont(font);
				FontMetrics m = g.getFontMetrics();

				g.setColor(new Color(238, 209, 161));
				//g.drawString(text, 5, 30 + (i*50));
				//------------------------------------------------------------------------------------------------------------------------------
				//quantity
				//ArrayList<BufferedImage> quantity = isolateCharacters(window.getSubimage(246, i*83, 34, 44));
				ArrayList<BufferedImage> qChars = isolateCharacters(window.getSubimage(246, i*83, 34, 44));
				ArrayList<BufferedImage> quantityChars = new ArrayList<BufferedImage>();

				for(int k = 0; k< qChars.size(); k++){
					quantityChars.add(trimTopAndBottom(qChars.get(k)));
				}

				String quantityText = "";
				for(int j = 0; j<quantityChars.size();j++){
					//g.drawImage(scaleImage(nameChars.get(j)), j*21, i*83, null);
					quantityText += ocr.readImageNumber(scaleImage(quantityChars.get(j)));
					if(!alreadyKnown(scaleImage(quantityChars.get(j)))){
						knownCharacters.add(scaleImage(quantityChars.get(j)));
						//saveBufferedImage(scaleImage(quantityChars.get(j)), baseDirectory+"/characters/numbers/" + knownCharacters.size()+".png");
					}
				}
				int quantity = 0;
				if(quantityText!=""&&!quantityText.contains("_")){
					quantity = Integer.valueOf(quantityText);
					g.setColor(new Color(238, 209, 1));
					//g.drawString(quantity+"", 270, 30 + (i*50));
				}
				//price
				//ArrayList<BufferedImage> price = isolateCharacters(window.getSubimage(300, i*83, 102, 44));
				ArrayList<BufferedImage> pChars = isolateCharacters(window.getSubimage(300, i*83, 102, 44));
				ArrayList<BufferedImage> priceChars = new ArrayList<BufferedImage>();

				for(int k = 0; k< pChars.size(); k++){
					priceChars.add(trimTopAndBottom(pChars.get(k)));
				}

				String priceText = "";
				for(int j = 0; j<priceChars.size();j++){
					//g.drawImage(scaleImage(nameChars.get(j)), j*21, i*83, null);
					priceText += ocr.readImageNumber(scaleImage(priceChars.get(j)));
					if(!alreadyKnown(scaleImage(priceChars.get(j)))){
						knownCharacters.add(scaleImage(priceChars.get(j)));
						//saveBufferedImage(scaleImage(priceChars.get(j)), baseDirectory+"/characters/numbers/" + knownCharacters.size()+".png");
					}
				}
				int price = -1;
				if(priceText!="" && !priceText.contains("_")){
					price = Integer.valueOf(priceText);
				}

				//g.setColor(new Color(205, 205, 205));
				//g.drawString(priceText+"", 340, 30 + (i*50));

				Listing listing = new Listing(text, quantity, price, currentCity);
				if(listing.name!="" && ocr.possibleNamesAsList.contains(listing.name)){

					listing.Save();
					addListing(listing);
				}
				//listing.Draw(g, 20, 30+(i*40));

			}
			if(state==this.DISPLAY_LISTINGS){
				for(int i = listings.size()-1; i>listings.size()-28 && i>0; i--){
					listings.get(i).Draw(g, 5, 20+(i*20), new Color(238, 209, 161));
				}
			}
			else if(state==this.DISPLAY_OPPORTUNITIES){
				ArrayList<Opportunity> opportunities = getOpportunities();
				Collections.sort(opportunities);
				for(int i = 0; i<opportunities.size() && i<10; i++){
					opportunities.get(i).buy.Draw(g, 5, 20+(i*50), Color.red);
					opportunities.get(i).sell.Draw(g, 5, 40+(i*50), Color.green);
				}
			}
		}
		else{
			Font font = new Font("Iwona Heavy",Font.BOLD,46);
			g.setFont(font);
			FontMetrics m = g.getFontMetrics();

			g.setColor(Color.red);
			g.drawString("PAUSED", 140, 200);
		}
	}

}
