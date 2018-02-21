package program;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import javax.imageio.ImageIO;







/*
 * @Author: Matthew Finzel (mfinzel5@gmail.com)
 * 
 * You have my permission to use this program but you may not redistribute it without my permission. 
 */
public class Images implements Serializable{
	public static BufferedImage loadLocal(String imageName)
    {
        BufferedImage image;
        try
        {
            image = ImageIO.read(Images.class.getResourceAsStream(imageName));
            BufferedImage img = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics g = img.getGraphics();
            g.drawImage(image, 0, 0, null);
            g.dispose();
            image = img;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
        return image;
    }
	public static BufferedImage load(String imageName)
	{
		//System.out.println(imageName);
		File file = new File(imageName);
		if(file.length()==0||!(imageName.contains(".png")||imageName.contains(".PNG"))){
			System.out.println("The file was empty!");
			return null;
		}
		String path = Images.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		path = path.replaceFirst("/", "");
		//System.out.println("path: "+path);
		imageName = imageName.replaceAll(path, "");
		//System.out.println("Attempting to load: "+imageName);
		BufferedImage image;
		try
		{
			image = ImageIO.read(new File(imageName));
			BufferedImage img = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
			Graphics g = img.getGraphics();
			g.drawImage(image, 0, 0, null);
			g.dispose();
			image = img;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		return image;
	}
	
	public static BufferedImage combineImages(ArrayList<BufferedImage> images){
		BufferedImage result = new BufferedImage( 200,200, BufferedImage.TYPE_INT_ARGB);

		return result;
	}
	public static int getTint(Color clr){
		if(clr.getRed()>=clr.getBlue()&&clr.getRed()>=clr.getGreen()){
			return clr.getRed();
		}
		if(clr.getGreen()>=clr.getBlue()&&clr.getGreen()>=clr.getRed()){
			return clr.getGreen();
		}
		if(clr.getBlue()>=clr.getRed()&&clr.getBlue()>=clr.getGreen()){
			return clr.getBlue();
		}
		return -1;
	}
	public static boolean isSameColorDifferentShade(Color clr1, Color clr2){
		double similarityThreshold = .25;
		//compare colors in color 1
		double clr1RedVsGreen;
		double clr1BlueVsGreen;
		double clr1RedVsBlue;
		if(clr1.getGreen()!=0){
			clr1RedVsGreen = (double)clr1.getRed()/(double)clr1.getGreen();
			clr1BlueVsGreen = (double)clr1.getBlue()/(double)clr1.getGreen();
		}
		else{
			clr1RedVsGreen = 1.0;
			clr1BlueVsGreen = 1.0;
		}
		if(clr1.getBlue()!=0){
			clr1RedVsBlue = clr1.getRed()/clr1.getBlue();
		}
		else{
			clr1RedVsBlue=1.0;
		}

		//compare colors in color 2
		//compare colors in color 2
		double clr2RedVsGreen;
		double clr2BlueVsGreen;
		double clr2RedVsBlue;
		if(clr2.getGreen()!=0){
			clr2RedVsGreen = (double)clr2.getRed()/(double)clr2.getGreen();
			clr2BlueVsGreen = (double)clr2.getBlue()/(double)clr2.getGreen();
		}
		else{
			clr2RedVsGreen = 1.0;
			clr2BlueVsGreen = 1.0;
		}
		if(clr2.getBlue()!=0){
			clr2RedVsBlue = clr1.getRed()/clr2.getBlue();
		}
		else{
			clr2RedVsBlue=1.0;
		}

		if(Math.abs(clr1RedVsGreen-clr2RedVsGreen)<=similarityThreshold){
			if(Math.abs(clr1RedVsBlue-clr2RedVsBlue)<=similarityThreshold){
				if(Math.abs(clr1BlueVsGreen-clr2BlueVsGreen)<=similarityThreshold){
					return true;
				}
			}
		}

		return false;
	}
	public static BufferedImage pixelate(BufferedImage img, int scale){
		BufferedImage result = new BufferedImage( img.getWidth()*scale,img.getHeight()*scale, BufferedImage.TYPE_INT_ARGB);
		Graphics g = result.getGraphics();
//		for(int i = 0; i<img.getWidth();i++){
//			for(int j = 0; j<img.getHeight();j++){
//				g.setColor(new Color(img.getRGB(i, j),true));
//				g.fillRect(i*scale, j*scale, scale, scale);
//			}
//		}
		g.drawImage(img, 0,0,img.getWidth()*scale, img.getHeight()*scale, null);
		return result;
	}

	public static BufferedImage shrink(BufferedImage img){
		int baseScale = getImageScale(img);
		baseScale = 2;
		if(img!=null){

			BufferedImage result = new BufferedImage( img.getWidth()/(baseScale),img.getHeight()/(baseScale), BufferedImage.TYPE_INT_ARGB);
			Graphics g = result.getGraphics();
			for(int i = 0; i<result.getWidth();i++){
				for(int j = 0; j<result.getHeight();j++){
					Color colorAtThisPoint = new Color(img.getRGB(i*(baseScale), j*(baseScale)),true);
					result.setRGB(i, j, colorAtThisPoint.getRGB());
					//g.setColor(colorAtThisPoint);
					//g.fillRect(i*(baseScale/2), j*(baseScale/2), baseScale/2, baseScale/2);
				}
			}

			//System.out.println("shrunk something!-----------------------------------------------------------");
			return result;
		}

		return null;
	}

	public static void save(BufferedImage img, String pathToImage){
		System.out.println("Saving to: "+pathToImage);
		String path = Images.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		path = path.replaceFirst("/", "");

		pathToImage = pathToImage.replaceAll(path, "/");
		File outputfile = new File(pathToImage);
		outputfile.mkdirs();
		try {
			ImageIO.write(img, "png", outputfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int getImageScale(String imageName){
		int scale = -1;
		Color red = new Color(255,0,0,255);
		Color white = new Color(255,255,255,255);
		if(imageName.contains(".png")||imageName.contains(".PNG")){

			BufferedImage img = load(imageName);
			if(img==null){
				System.out.println("Failed to get image scale.");
				return -1;
			}
			scale = img.getWidth();
			int currentScale = 99;


			Color currentColor;
			Color previousColor = new Color(img.getRGB(0, 0),true);
			for(int i = 0; i<img.getWidth();i++){	
				for(int j = 1; j<img.getHeight();j++){
					previousColor = new Color(img.getRGB(i, j-1),true);
					currentColor = new Color(img.getRGB(i, j),true);
					//if the current pixel is not transparent
					if(currentColor.getAlpha()>=5&&previousColor.getAlpha()>=5){
						//the pixel is not red or white
						//if(!currentColor.equals(red)&&!currentColor.equals(white)&&!previousColor.equals(red)&&!previousColor.equals(white)){
						//if(currentColor.equals(previousColor)){
						if(colorsEqual(currentColor,previousColor,2)){
							currentScale++;
						}
						else{
							if(scale>currentScale){
								scale=currentScale;
							}
							currentScale = 1;
						}
						//}
					}
				}
				//currentScale = 0;
			}
		}
		//System.out.println("sdfsd++++++++++++++");
		return scale;
	}

	
	//returns the average of all the colors in the arraylist
	public static Color averageColor(ArrayList<Color> colors){
		int red = 0;
		int green = 0;
		int blue = 0;
		int alpha = 0;

		for(int i = 0; i<colors.size();i++){
			red+=colors.get(i).getRed();
			green+=colors.get(i).getGreen();
			blue+=colors.get(i).getBlue();
			alpha+=colors.get(i).getAlpha();
		}
		red = red/colors.size();
		green = green/colors.size();
		blue = blue/colors.size();
		if(alpha!=0){
			alpha = alpha/colors.size();
		}

		return new Color(red,green,blue,alpha);
	}
	public static int getImageScale(BufferedImage img){
		int scale = -1;
		Color red = new Color(255,0,0,255);
		Color white = new Color(255,255,255,255);


		if(img==null){
			return -1;
		}
		scale = img.getWidth();
		int currentScale = 99;


		Color currentColor;
		Color previousColor = new Color(img.getRGB(0, 0),true);
		for(int i = 0; i<img.getWidth();i++){	
			for(int j = 1; j<img.getHeight();j++){
				previousColor = new Color(img.getRGB(i, j-1),true);
				currentColor = new Color(img.getRGB(i, j),true);
				//if the current pixel is not transparent
				if(currentColor.getAlpha()>=5&&previousColor.getAlpha()>=5){
					//the pixel is not red or white
					if(!currentColor.equals(red)&&!currentColor.equals(white)&&!previousColor.equals(red)&&!previousColor.equals(white)){
						//if(currentColor.equals(previousColor)){
						if(colorsEqual(currentColor,previousColor,2)){
							currentScale++;
						}
						else{
							if(scale>currentScale){
								scale=currentScale;
							}
							currentScale = 1;
						}
					}
				}
			}
			//currentScale = 0;
		}

		return scale;
	}
	//	public static boolean sharpenTilesg(String imageName, boolean scaledUP){
	//		System.out.println("Sharpening tiles: "+imageName);
	//		int tileSize = 32;
	//		if(scaledUP){
	//			tileSize = 64;
	//		}
	//		BufferedImage img = load(imageName);
	//		if(img.getWidth()%tileSize==0&&img.getHeight()%tileSize==0){
	//			BufferedImage[][] tiles = cut(imageName,tileSize,tileSize);
	//			for(int i = 0; i<tiles.length;i++){
	//				for(int j = 0; j<tiles[0].length;j++){
	//					//int scale = getImageScale(tiles[i][j]);
	//					tiles[i][j]=sharpen(tiles[i][j]);
	//					//tiles[i][j]=smoothImage(tiles[i][j]);
	//					//System.out.println((int)((((double)(i*j))/((double)tiles.length*(double)tiles[0].length))*100.0)+"%");
	//				}
	//			}
	//
	//			//build final image
	//			BufferedImage result = new BufferedImage( img.getWidth(),img.getHeight(), BufferedImage.TYPE_INT_ARGB);
	//			Graphics g = result.getGraphics();
	//
	//			for(int i = 0;i<tiles.length;i++){
	//				for(int j = 0; j<tiles[0].length;j++){
	//					g.drawImage(tiles[i][j],i*tileSize,j*tileSize,null);
	//				}
	//			}
	//			if(program.roughen)
	//				result = Images.roughenImage(result);
	//			//save image
	//			String path = program.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	//			path = path.replaceFirst("/", "");
	//
	//			imageName = imageName.replaceAll(path, "/");
	//			File outputfile = new File("src/results/"+imageName);
	//			outputfile.mkdirs();
	//			try {
	//				ImageIO.write(result, "png", outputfile);
	//			} catch (IOException e) {
	//				// TODO Auto-generated catch block
	//				e.printStackTrace();
	//			}
	//			return true;
	//		}
	//		return false;
	//
	//	}
	
	public static void drawWithTransparency(BufferedImage original, BufferedImage newImage){
		System.out.println("Does original have alpha model?" +original.getColorModel().getTransparency());
		for(int i = 0; i<original.getWidth();i++){
			for(int j = 0; j<original.getHeight();j++){
				Color oldColor = new Color(original.getRGB(i, j),true);

				if(oldColor.getAlpha()==255){
					Color newColor = new Color(255,0,0,0);
					newImage.setRGB(i, j, newColor.getRGB());//original.getRGB(i, j));
				}
				else{
					Color newColor = new Color(oldColor.getRed(),oldColor.getGreen(),oldColor.getBlue(),0);
					newImage.setRGB(i, j,newColor.getRGB());
				}
			}
		}
	}

	public static void setRGB(Color[][] source, BufferedImage result, int x, int y, int colorX, int colorY){
		if(colorX>=0&&colorY>=0&&colorX<source.length&&colorY<source[0].length){

			if(source[colorX][colorY]!=null){
				result.setRGB(x, y, source[colorX][colorY].getRGB());
			}
		}

	}
	//	public static boolean sharpeng(String imageName, boolean scaledUP){
	//		System.out.println("sharpen 2 called.");
	//		int scale = getImageScale(imageName);
	//		System.out.println("scale: "+scale);
	//		if(scale>=1){
	//			BufferedImage img = load(imageName);
	//			System.out.println("ffffffff "+imageName);
	//			if(scale>=2&&!imageName.contains("Tilesets")){
	//				
	//				BufferedImage result = new BufferedImage( img.getWidth(),img.getHeight(), BufferedImage.TYPE_INT_ARGB);
	//				Graphics g = result.getGraphics();
	//
	//				g.drawImage(img,0,0,null);
	//				//drawWithTransparency(img,result);
	//				//g.drawImage(img,img.getWidth(),0,null);
	//				boolean[][] modified = new boolean[img.getWidth()][img.getHeight()];
	//				//determine the offset of x and y
	//				int xOffset = 0;
	//				int yOffset = 0;
	//				for(int i = 0; i<img.getWidth();i++){
	//					for(int j = 0; j<img.getHeight();j++){
	//						if(new Color(img.getRGB(i, j),true).getAlpha()!=0){
	//							xOffset = i%2;
	//							yOffset = j%2;
	//						}
	//					}
	//				}
	//				for(int i = xOffset; i<img.getWidth()-1;i+=2){
	//					for(int j = yOffset; j<img.getHeight()-1;j+=2){
	//						//System.out.println(i+","+j);
	//						Color topLeft = new Color(img.getRGB(i, j),true);
	//						Color topRight = new Color(img.getRGB(i+1, j),true);
	//						Color bottomLeft = new Color(img.getRGB(i, j+1),true);
	//						Color bottomRight = new Color(img.getRGB(i+1, j+1),true);
	//
	//						if(colorsEqual(topLeft,bottomRight,10)&&!colorsEqual(topRight,bottomLeft,10)){
	//
	//							//recolor top right
	//							if(!isEye(img,i+1,j))
	//								result.setRGB(i+1, j, topLeft.getRGB());
	//							//recolor bottom left
	//							if(!isEye(img,i,j+1))
	//								result.setRGB(i, j+1, topLeft.getRGB());
	//						}
	//						if(colorsEqual(topRight,bottomLeft,10)&&!colorsEqual(topLeft,bottomRight,10)){
	//
	//							//recolor top left
	//							if(!isEye(img,i,j))
	//								result.setRGB(i, j, topRight.getRGB());
	//							//bottom right
	//							if(!isEye(img,i+1,j+1))
	//								result.setRGB(i+1, j+1, topRight.getRGB());
	//						}
	//					}
	//				}
	//				//if(imageName.contains("Battlers")){
	//				//	result = Images.randomizeImageColor(result);
	//				//}
	//				//smooth the result
	//				result = smoothImage(result);
	//				if(program.roughen)
	//					result = Images.roughenImage(result);
	//				String path = program.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	//				path = path.replaceFirst("/", "");
	//
	//				imageName = imageName.replaceAll(path, "/");
	//				File outputfile = new File("src/results/"+imageName);
	//				outputfile.mkdirs();
	//				try {
	//					ImageIO.write(result, "png", outputfile);
	//				} catch (IOException e) {
	//					// TODO Auto-generated catch block
	//					e.printStackTrace();
	//				}
	//				return true;
	//			}
	//			else{
	//				System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	//				if(!imageName.contains("Animations")){
	//					if(!img.equals(sharpenTiles(img))){
	//						
	//						String path = program.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	//						path = path.replaceFirst("/", "");
	//
	//						imageName = imageName.replaceAll(path, "/");
	//						File outputfile = new File("src/results/rejects/"+imageName);
	//						outputfile.mkdirs();
	//						try {
	//							ImageIO.write(img, "png", outputfile);
	//						} catch (IOException e) {
	//							// TODO Auto-generated catch block
	//							e.printStackTrace();
	//						}
	//						return false;
	//					}
	//					else{
	//						return true;
	//					}
	//				}
	//				else{
	//					System.out.println("Skipping animation folder. Nothing needs to be converted in this folder.");
	//					return false;
	//				}
	//			}
	//		}
	//		else{
	//			System.out.println(imageName+" could not be sharpened further.");
	//			return false;
	//		}
	//	}
	
	public static BufferedImage expandImage(BufferedImage img, int scale){
		BufferedImage result = new BufferedImage( img.getWidth()*scale,img.getHeight()*scale, BufferedImage.TYPE_INT_ARGB);
		Graphics g = result.getGraphics();
		for(int i = 1; i<img.getWidth()-1;i++){
			for(int j = 1; j<img.getHeight()-1;j++){
				Color current = new Color(img.getRGB(i, j),true);
				result.setRGB(i*scale, j*scale, current.getRGB());
				if(current.getAlpha()>245){
					ArrayList<Integer> xpoints = new ArrayList<Integer>();
					ArrayList<Integer> ypoints = new ArrayList<Integer>();
					boolean temp = false;
					for(int x = i-1;x<=i+1;x++){
						for(int y = j-1;y<=j+1;y++){
							g.setColor(current);
							if(!(x==i&&y==j)&&current.equals(new Color(img.getRGB(x, y),true))){
								g.drawLine(i*scale, j*scale, x*scale, y*scale);
								temp = true;
							}
							else{
								g.drawLine(i*scale, j*scale, x*scale, y*scale);
								result.setRGB(i*scale, j*scale, current.getRGB());
								result.setRGB(x*scale, y*scale, img.getRGB(x, y));
							}
						}
					}
					if(!temp){
						//g.fillRect((i)*scale, (j)*scale, scale+1, scale+1);
					}

				}
				result.setRGB(i*scale, j*scale, current.getRGB());
			}
		}

		//				Color current = new Color(img.getRGB(i, j),true);
		//
		//				Color topLeft = new Color(img.getRGB(i, j),true);
		//				Color topRight = new Color(img.getRGB(i+1, j),true);
		//				Color bottomLeft = new Color(img.getRGB(i, j+1),true);
		//				Color bottomRight = new Color(img.getRGB(i+1, j+1),true);
		//				int x = i*scale;
		//				int y = j*scale;
		//				if(current.getAlpha()>245){
		//					g.setColor(Color.red);
		//					g.fillRect(x, y, scale, scale);
		//				}
		//				boolean oneWasRight = false;
		//				if(topLeft.equals(topRight)&&topLeft.equals(bottomLeft)){//topleft,topright,bottomleft
		//					oneWasRight = true;
		//					g.setColor(topLeft);
		//					int xpoints[] = {x,x+scale,x,x};
		//					int ypoints[] = {y,y,y+scale,y};
		//					g.fillPolygon(xpoints, ypoints, 4);
		//				}
		//				if(topLeft.equals(topRight)&&topLeft.equals(bottomRight)){//topleft,topright,bottomright
		//					oneWasRight = true;
		//					g.setColor(topLeft);
		//					int xpoints[] = {x,x+scale,x+scale,x};
		//					int ypoints[] = {y,y,y+scale,y};
		//					g.fillPolygon(xpoints, ypoints, 4);
		//				}
		//				if(topLeft.equals(bottomLeft)&&topLeft.equals(bottomRight)){//topleft,bottomleft,bottomright
		//					oneWasRight = true;
		//					g.setColor(topLeft);
		//					int xpoints[] = {x,x,x+scale,x};
		//					int ypoints[] = {y,y+scale,y+scale,y};
		//					g.fillPolygon(xpoints, ypoints, 4);
		//				}
		//				if(topRight.equals(bottomRight)&&topRight.equals(bottomLeft)){//topright,bottomleft,bottomright
		//					oneWasRight = true;
		//					g.setColor(topRight);
		//					int xpoints[] = {x+scale,x+scale,x,x+scale};
		//					int ypoints[] = {y,y+scale,y+scale,y};
		//					g.fillPolygon(xpoints, ypoints, 4);
		//				}
		//
		//				//second part
		//				if(topRight.equals(bottomLeft)&&!topRight.equals(topLeft)&&!topRight.equals(bottomRight)){//topleft,topright,bottomleft
		//					oneWasRight = true;
		//					g.setColor(topLeft);
		//					int xpoints[] = {x,x+scale,x,x};
		//					int ypoints[] = {y,y,y+scale,y};
		//					g.fillPolygon(xpoints, ypoints, 4);
		//				}
		//				if(topLeft.equals(bottomRight)&&!topLeft.equals(topRight)&&!topLeft.equals(bottomLeft)){//topleft,topright,bottomright
		//					oneWasRight = true;
		//					g.setColor(topRight);
		//					int xpoints[] = {x,x+scale,x+scale,x};
		//					int ypoints[] = {y,y,y+scale,y};
		//					g.fillPolygon(xpoints, ypoints, 4);
		//				}
		//				if(topLeft.equals(bottomRight)&&!topLeft.equals(bottomLeft)&&!topLeft.equals(topRight)){//topleft,bottomleft,bottomright
		//					oneWasRight = true;
		//					g.setColor(bottomLeft);
		//					int xpoints[] = {x,x,x+scale,x};
		//					int ypoints[] = {y,y+scale,y+scale,y};
		//					g.fillPolygon(xpoints, ypoints, 4);
		//				}
		//				if(topRight.equals(bottomLeft)&&!topRight.equals(bottomRight)&&!topRight.equals(topLeft)){//topright,bottomleft,bottomright
		//					oneWasRight = true;
		//					g.setColor(bottomRight);
		//					int xpoints[] = {x+scale,x+scale,x,x+scale};
		//					int ypoints[] = {y,y+scale,y+scale,y};
		//					g.fillPolygon(xpoints, ypoints, 4);
		//				}
		//				if(!oneWasRight){
		//					
		//						//g.setColor(Color.yellow);
		//						//g.fillRect(x, y, scale, scale);
		//					
		//					g.setColor(bottomLeft);
		//					g.fillRect(x, y, scale, scale);
		//
		//				}

		//					//g.setColor(current);
		//					g.setColor(new Color(img.getRGB(i+1, j+1),true));
		//					int x = i*scale;
		//					int y = j*scale;
		//					int xpoints[] = {x,x+scale,x+scale,x};
		//				    int ypoints[] = {y,y,y+scale,y};
		//				    int npoints = 4;
		//
		//				    g.fillPolygon(xpoints, ypoints, npoints);
		//				    
		//				    g.setColor(current);
		//				    //g.setColor(new Color(img.getRGB(i+1, j+1),true));
		//					int xpoints2[] = {x,x+scale,x,x};
		//				    int ypoints2[] = {y,y+scale,y+scale,y};
		//				    int npoints2 = 4;
		//
		//				    g.fillPolygon(xpoints2, ypoints2, npoints);
		//					for(int x = i-1;x<=i+1;x++){
		//						for(int y = j-1;y<=j+1;y++){
		//							if(!(x==i&&y==j)){
		//								
		//								g.drawLine(i*scale, j*scale, x*scale, y*scale);
		//								if(colorsEqual(new Color(img.getRGB(x, y),true),Color.black,10)){
		//									result.setRGB(x*scale, y*scale, new Color(img.getRGB(i, j),true).getRGB());
		//								}
		//							}
		//						}
		//					}

		//}
		//}
		return result;
	}
	
	public static boolean isAnEye(BufferedImage img, int x, int y){
		Color properColor = new Color(img.getRGB(x, y),true);
		int totalMatches = 0;
		for(int i = x-2; i<=x+2;i++){
			for(int j = y-2; j<=y+2;j++){
				if(i>0&&j>0&&i<img.getWidth()-1&&j<img.getHeight()-1){
					//System.out.println(i+","+j);
					Color currentColor = new Color(img.getRGB(i, j),true);
					if(!(i==x&&j==y)&&colorsEqual(currentColor,properColor,1)){
						totalMatches++;//total nearby pixels including corners
					}

				}
			}
		}
		if(totalMatches<=2){
			return true;
		}
		return false;
	}
	public static boolean colorsEqual(Color color1, Color color2, int threshold){
		if(color1==null||color2==null){
			return false;
		}
		if(color1.getRed()<=color2.getRed()+threshold&&color1.getRed()>=color2.getRed()-threshold){
			if(color1.getGreen()<=color2.getGreen()+threshold&&color1.getGreen()>=color2.getGreen()-threshold){
				if(color1.getBlue()<=color2.getBlue()+threshold&&color1.getBlue()>=color2.getBlue()-threshold){
					if(color1.getAlpha()<=color2.getAlpha()+threshold&&color1.getAlpha()>=color2.getAlpha()-threshold){
						return true;
					}
				}
			}
		}
		return false;
	}
	//	public static BufferedImage resizeImage(String imageName){
	//		if(imageName.contains(".png")){
	//			BufferedImage img = Images.load(imageName);
	//			if(img!=null){
	//				BufferedImage result = new BufferedImage( img.getWidth()*2,img.getHeight()*2, BufferedImage.TYPE_INT_ARGB);
	//				Graphics g = result.getGraphics();
	//				g.drawImage(img,0,0,img.getWidth()*2,img.getHeight()*2,null);
	//
	//				//save changes
	//				String path = program.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	//				path = path.replaceFirst("/", "");
	//
	//				imageName = imageName.replaceAll(path, "/");
	//				File outputfile = new File("src/"+imageName);
	//				outputfile.mkdirs();
	//				try {
	//					ImageIO.write(result, "png", outputfile);
	//				} catch (IOException e) {
	//					// TODO Auto-generated catch block
	//					e.printStackTrace();
	//				}
	//				return result;
	//			}
	//		}
	//		return null;
	//
	//	}
	public static BufferedImage resizeImage(BufferedImage img){

		if(img!=null){
			BufferedImage result = new BufferedImage( img.getWidth()*2,img.getHeight()*2, BufferedImage.TYPE_INT_ARGB);
			Graphics g = result.getGraphics();
			g.drawImage(img,0,0,img.getWidth()*2,img.getHeight()*2,null);

			return result;
		}

		return null;

	}
	public static BufferedImage[][] cut(String imageName, int sliceWidth, int sliceHeight)
	{
		//System.out.println("Starting image cut for "+imageName);
		File file = new File(imageName);
		if(file.length()==0){
			System.out.println("The file was empty!");
			return null;
		}
		String path = Images.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		path = path.replaceFirst("/", "");

		imageName = imageName.replaceAll(path, "/");
		//long temp = System.currentTimeMillis();
		BufferedImage sheet;
		try
		{
			sheet = ImageIO.read(Images.class.getResourceAsStream(imageName));
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}

		int w = sheet.getWidth();
		int h = sheet.getHeight();

		int xSlices = w/sliceWidth;
		int ySlices = h/sliceHeight;

		BufferedImage[][] images = new BufferedImage[xSlices][ySlices];
		for (int x=0; x<xSlices; x++)
			for (int y=0; y<ySlices; y++)
			{
				BufferedImage img = new BufferedImage(sliceWidth, sliceHeight, BufferedImage.TYPE_INT_ARGB);
				Graphics g = img.getGraphics();
				g.drawImage(sheet, -x*sliceWidth, -y*sliceHeight, null);
				g.dispose();
				images[x][y] = img;
			}

		//System.out.println("Done cutting image for "+imageName+". Total time spent on cut = "+(System.currentTimeMillis()-temp));
		return images;
	}
	public static BufferedImage[][] cut(BufferedImage sheet, int sliceWidth, int sliceHeight)
	{


		int w = sheet.getWidth();
		int h = sheet.getHeight();

		int xSlices = w/sliceWidth;
		int ySlices = h/sliceHeight;

		BufferedImage[][] images = new BufferedImage[xSlices][ySlices];
		for (int x=0; x<xSlices; x++)
			for (int y=0; y<ySlices; y++)
			{
				BufferedImage img = new BufferedImage(sliceWidth, sliceHeight, BufferedImage.TYPE_INT_ARGB);
				Graphics g = img.getGraphics();
				g.drawImage(sheet, -x*sliceWidth, -y*sliceHeight, null);
				g.dispose();
				images[x][y] = img;
			}

		//System.out.println("Done cutting image for "+imageName+". Total time spent on cut = "+(System.currentTimeMillis()-temp));
		return images;
	}
}
