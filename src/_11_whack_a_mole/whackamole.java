package _11_whack_a_mole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackamole {

	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	
	public static void main(String[] args) {
		

		
	}
	
	void frame()
	{
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		
		frame.show(true);
		frame.add(panel);
		frame.setName("Whack a Button for Fame and Glory");
		frame.setSize(250, 300);
		panel.add(button);
		
		
		
	}
}
