package program;


import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;


public class Listing {
	String name = "";
	int quantity = 0;
	int price = 0;
	String city = "";
	long age = System.currentTimeMillis();
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://192.168.1.12";

	//  Database credentials
	static final String USER = "username";
	static final String PASS = "password";

	public Listing(String n, int q, int p, String c){
		name = n;
		quantity = q;
		price = p;
		city = c;
	}
	public void Save(){

//		Connection conn = null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			conn = DriverManager.getConnection(DB_URL,USER,PASS);
//			conn.close();
//		} catch (ClassNotFoundException | SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		String fileName = name;
		//remove spaces from name
		fileName = fileName.replaceAll("\\s+", "");
		String folderName = GamePanel.baseDirectory + File.separator + "data";
		Path saveDirectory = Paths.get(folderName);
		String path = GamePanel.baseDirectory + File.separator + "data";

		//create an empty folder to store save files in if none exist
		if(Files.notExists(saveDirectory)){			
			//(use relative path for Unix systems)
			File dir = new File(path);
			//(works for both Windows and Linux)
			dir.mkdirs();
		}

		//create a text file inside the folder to store the information

		File data = new File((saveDirectory.toAbsolutePath()) +File.separator+ city+"_"+fileName + ".txt");
		try {
			data.createNewFile();
		} catch (IOException e) {
			System.out.println("new file already existed");
		}

		//write the relevant data to the file
		FileWriter output = null;
		try{

			output = new FileWriter(data,false);

			output.write(name+"\n");
			output.write(quantity+"\n");
			output.write(price+"\n");
			output.write(System.currentTimeMillis()+"\n");

			try{output.close();}catch(Exception ex){System.out.println("There was some kind of error closing the file.");}

		}
		catch(Exception ex){
			System.out.println("Failed to write to (or create) file to store the data.");
			ex.printStackTrace();
		}
		finally{
			try{output.close();}catch(Exception ex){System.out.println("F There was some kind of error closing the file.");}
		}
	}
	public void Draw(Graphics g, int x, int y, Color fontColor){
		Font font = new Font("Iwona Heavy",Font.BOLD,15);
		g.setFont(font);
		FontMetrics m = g.getFontMetrics();

		g.setColor(fontColor);
		g.drawString(name, x+50, y);
		g.drawString(quantity+"", x+315, y);
		g.drawString(price+"", x+385, y);
		
		g.setColor(new Color(28, 209, 161));
		if(city=="BlackMarket"){
			g.drawString("BM", x+5, y);
		}
		else if(city=="Caerleon"){
			g.drawString("C", x+5, y);
		}
	}
}
