package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class piglatin implements ActionListener {
	
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JTextField text, text2;
	private JLabel label;
	String word;
	
	void main()
	{
		piglatin pig = new piglatin();
		pig.frame();
		
		PigLatinTranslator Pig = new PigLatinTranslator();
		
	}
	
	void frame()
	{
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Translate");
		text = new JTextField();
		text2 = new JTextField();
		
		panel.add(text);
		panel.add(button);
		panel.add(text2);
		
		frame.add(panel);
		
		frame.resize(500, 100);
		
		frame.show(true);
		
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		word = text.getText();
		
	JLabel label = new JLabel();
	
	label.setText(word);
	
	frame.add(label);
	
	}
	



	
	
	
	
}

