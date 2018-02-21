package program;
import java.awt.MouseInfo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;


public class Controller extends JPanel implements KeyListener,MouseListener,MouseMotionListener,MouseWheelListener{
	private JPanel gamePanel;
	@Override
	public void mouseWheelMoved(MouseWheelEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_F12){
			if(GamePanel.paused){
				GamePanel.paused=false;
				System.out.println("Unpaused");
				GamePanel.mousePos = MouseInfo.getPointerInfo().getLocation();
			}
			else{
				GamePanel.paused=true;
				System.out.println("Paused");
			}
			//GamePanel.saveSampleResults();
		}
		if(e.getKeyCode()==KeyEvent.VK_0){
			if(GamePanel.state<1){
				GamePanel.state++;
			}
			else{
				GamePanel.state=0;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void setGamePanel(JPanel panelRef) {
		gamePanel = panelRef;
		gamePanel.addKeyListener(this);
		gamePanel.addMouseListener(this);
		gamePanel.addMouseMotionListener(this);
		gamePanel.addMouseWheelListener(this);
	}

}
