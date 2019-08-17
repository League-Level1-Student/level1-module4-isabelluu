package _11_whack_a_mole;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackamole {

	private JFrame frame;
	private JPanel panel;
	private JButton button, button1, button2, button3, button4, button5, button6, button7, button8, button9, button11, button12, button13, button14, button10;
	
	
	void frame()
	{
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		button10 = new JButton();
		button11 = new JButton();
		button12 = new JButton();
		button13 = new JButton();
		button14 = new JButton();
		
		
		
		frame.add(panel);
		frame.setName("Whack a Button for Fame and Glory");
		frame.setSize(250, 200);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		
		frame.show(true);

		Random num = new Random();
		int number = num.nextInt(15);
		
		drawbuttons(number);
		
		for(int x = 0; x<15; x++)
		{
		if(x == number)
		{
			
		}
			
		}
		
	}
	
	void drawbuttons(int num)
	{
		System.out.println(num);
		
	}
}
