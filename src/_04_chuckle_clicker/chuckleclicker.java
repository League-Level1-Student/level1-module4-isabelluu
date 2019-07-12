package _04_chuckle_clicker;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleclicker implements ActionListener {
	
	private JButton buttonJ;
	private JButton buttonP;
	
public static void main(String[] args) {
	
	chuckleclicker clicker = new chuckleclicker();
	
	clicker.makebuttons();

	
}
	
	 void makebuttons()
	{
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		buttonJ = new JButton("Joke");
		buttonP = new JButton("Punchline");
		
		panel.add(buttonJ);
		panel.add(buttonP);
		frame.add(panel);
		
		buttonJ.addActionListener(this);
		buttonP.addActionListener(this);
		
		frame.setPreferredSize(new Dimension(200,200));
		
		frame.resize(200, 60);
		
		
		frame.show(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed.equals(buttonJ))
		{
			JOptionPane.showMessageDialog(null, "What do you call birds that stick together?");
		}
		
		if(buttonPressed.equals(buttonP))
		{
			JOptionPane.showMessageDialog(null, "Vel-crow");
		}
	}
	
}
