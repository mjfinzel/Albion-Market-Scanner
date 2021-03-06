package program;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class AppletUI extends JFrame{
	private static final long serialVersionUID = -6215774992938009947L;
	public static int windowWidth=480;
	public static int windowHeight=600;
	public static Point location = new Point(0,165);
	public static int GAME_FPS = 20;
	public static final long milisecInNanosec = 1000000L;
	public static final long secInNanosec = 1000000000L;
	private final long GAME_UPDATE_PERIOD = secInNanosec / GAME_FPS;
	Controller ctrl;
	public static void main(String[] args) throws IOException{

		AppletUI f = new AppletUI ();
		f.setSize(windowWidth,windowHeight);
		f.setVisible(true);
		
	}
	public AppletUI() {

		setSize(windowWidth,windowHeight);
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		setTitle("Market Tool");
		JPanel drawPanel = new GamePanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		drawPanel.setBackground(new Color(20,20,20));
		ctrl = new Controller();
		this.addKeyListener(ctrl);
		ctrl.setGamePanel(drawPanel);
		//this.setFocusable(true);
		pane.add(drawPanel);
		setLocation(location.x,location.y);
		//this.setExtendedState(Frame.MAXIMIZED_BOTH);  
		//this.setUndecorated(true);  
		//We start game in new thread.
		Thread gameThread = new Thread() {			
			public void run(){
				gameLoop();
			}
		};
		//setVisible(true);
		gameThread.start();
	}
	public void gameLoop(){
		long beginTime, timeTaken, timeLeft;
		while(true){
			windowWidth = this.getWidth();
			windowHeight = this.getHeight();
			
			
			beginTime = System.nanoTime();
			
			repaint();
			
			timeTaken = System.nanoTime() - beginTime;
			timeLeft = (GAME_UPDATE_PERIOD - timeTaken) / milisecInNanosec; // In milliseconds
			// If the time is less than 10 milliseconds, then we will put thread to sleep for 10 millisecond so that some other thread can do some work.
			if (timeLeft < 10){ 
				timeLeft = 10; //set a minimum
			}
			try {
				//Provides the necessary delay and also yields control so that other thread can do work.
				Thread.sleep(timeLeft);
			} catch (InterruptedException ex) { }
		}
	}
}
