import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class PlayField extends JFrame implements MouseListener{
	
	private static final long serialVersionUID = 1L;
	
	
	
	public PlayField(){
		
		
		
	}
	
	public static void main(String[] args) {
		
		PlayField playfield = new PlayField();
		playfield.setBounds(300, 50, 600, 600);
		playfield.setVisible(true);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}
