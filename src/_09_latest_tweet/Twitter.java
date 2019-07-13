package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Twitter implements ActionListener {
	
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JTextField text;
	
	public static void main(String[] args) {
		
		Twitter twitter = new Twitter();
		
		twitter.frame();
		
		
		
	}
	
	void frame()
	{
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Search");
		text = new JTextField();
		
		
		frame.resize(400, 100);
		
		text.setColumns(12);
		panel.add(text);
		panel.add(button);
		frame.add(panel);
		
		button.addActionListener(this);
		
		frame.show(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
