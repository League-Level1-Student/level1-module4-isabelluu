package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;




public class calculator implements ActionListener {

	
	private JButton add;
	private JButton sub;
	private JButton mul, div;
	private JTextField box1, box2;
	int finalnum;
	int num, num3;
	private JLabel label;
	private JFrame frame;
	
	
	public void run()
	{
		
		frame = new JFrame();
		JPanel panel = new JPanel();
		label = new JLabel();
		
		box1 = new JTextField();
		box2 = new JTextField();
		
		frame.add(panel);
		
		
		frame.show(true);
		
		
		frame.resize(380,120);
		
		add = new JButton("Add");
		sub = new JButton("Subtract");
		mul = new JButton("Multiply");
		div = new JButton("Divide");
		
		box1.setColumns(12);
		box2.setColumns(12);
		
		panel.add(box1);
		panel.add(box2);
		
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);

		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		panel.add(label);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		
		 String num1 = box1.getText();
		 String num2 = box2.getText();
		 
		 num = Integer.parseInt(num1);
		 num3 = Integer.parseInt(num2);
		 
		
		if(buttonPressed.equals(add))
		{
			add(num,num3);
		}
		
		if(buttonPressed.equals(sub))
		{
			sub(num,num3);
		}
		
		if(buttonPressed.equals(mul))
		{
			mul(num,num3);
		}
		
		if(buttonPressed.equals(div))
		{
			div(num,num3);
		}
		

		label.setText(finalnum + "");
	

		
	}

	int add(int num, int num1)
	{
		finalnum = num+num3;
		
		return(finalnum);
	}


	int sub(int num, int num1)
	{
		finalnum = num-num3;
		return(finalnum);
	}

	int mul(int num, int num1)
	{
		finalnum = num*num3;
		
		return(finalnum);
	}


	int div(int num, int num1)
	{
		finalnum = num/num3;
		return(finalnum);
	}


	
	
}
