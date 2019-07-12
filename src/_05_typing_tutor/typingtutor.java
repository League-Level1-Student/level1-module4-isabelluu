package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class typingtutor implements KeyListener {
	
	char currentLetter;
 

public static void main(String[] args) {
	
	typingtutor tutor = new typingtutor();

	tutor.currentLetter();
	
	}


private static char generateRandomLetter() {
	// TODO Auto-generated method stub
	
	 Random r = new Random();
     return (char) (r.nextInt(26) + 'a');
}

	void currentLetter()
	{
		JFrame frame = new JFrame("Type or Die");
		
		currentLetter = generateRandomLetter();
		
		JLabel jLabel = new JLabel();
		
		jLabel.addKeyListener(this);
		
		jLabel.setFont(jLabel.getFont().deriveFont(28.0f));
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add(jLabel);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
