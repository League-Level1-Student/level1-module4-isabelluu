import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class practice1 implements ActionListener {
	
	private JFrame frame;
	private JButton button1, button2;
	private JTextField textbox;
	private JLabel label;
	private JPanel panel;
	String text;

	public void run()
	{
		frame = new JFrame();
		button1 = new JButton("Submit");
		button2 = new JButton("Hint");
		textbox = new JTextField();
		label = new JLabel();
		panel = new JPanel();
		
		//label.setText("What comes down but never goes up?");
		label.setText("he");
		
		
		frame.resize(300, 100);
		frame.add(panel);
		panel.add(textbox);
		panel.add(button1);
		panel.add(button2);
		
		button1.setSize(50, 20);
		button2.setSize(50,20); 
		
		textbox.setColumns(12);
		frame.show(true);
		
		textbox.setSize(150, 20);


		button1.addActionListener(this);
		button2.addActionListener(this);
		
		text = textbox.getText();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton Buttonpressed = (JButton) e.getSource();
		
		if(Buttonpressed == button1)
		{
			if(text.equals("rain"))
				JOptionPane.showMessageDialog(null, "Correct");
			else
				JOptionPane.showMessageDialog(null, "Incorrect, try again");
		}
		
		if(Buttonpressed == button2)
		{
			JOptionPane.showMessageDialog(null, "It comes from the sky");
		}
		
	}
}
