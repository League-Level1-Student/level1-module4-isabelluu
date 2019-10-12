package _02_simon_says;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;

public class SimonSays extends KeyAdapter {

	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private boolean simonSays = false;
	Date timeAtStart;

	// Complete steps 1 - 7 before you test
	// 1. Declare a JFrame variable

	public void run() {
		// 2. Add the four images that match keyboard keys like this:
		// images.put(new Integer(KeyEvent.VK_UP), "up.jpg");

		// 3. Use a JOptionPane to tell the user the rules: "Press the matching
		// key when
		// 'Simon says' otherwise press a different key"

		// 4. Call the showImage method to show an image

	}

	public void keyPressed(KeyEvent e) {
		// 15. Make a points variable to track the score.

		// 16. If the keyCode matches the imageIndex and "Simon says"

		// 17. Increase the value of score

		// 18. Use the speak method to tell the user they were correct

		// 19. If the keyCode doesn't match the imageIndex and "Simon didn't
		// say..."

		// 20. Increase the value of score

		// 21. Use the speak method to tell the user they were correct

		// 22. Increment tries by 1

		// 25. If tries is greater than 9 (or however many you want)...

		// 26. Tell the user their score

		// 27. Exit the program

		// 23. Dispose of the frame

		// 24. Call the showImage method to show a new image
	}

	private void showImage() {
		// 5. Initialize your frame to a new JFrame()

		// 6. Set the frame to visible

		// 7. Uncomment the following line to add a random image to your frame
		// frame.add(getNextRandomImage());

		// 8. Set the name of your frame

		// 9. Pack the frame

		// 10. Set the defaultCloseOperation of your from to
		// JFrame.EXIT_ON_CLOSE

		// 11. Add a key listener to the frame

		// 12. Create a new instance of Random

		// 13. Use the Random and the speak method to either say
		// "Simon says press this key" or "Press this key"

		// 14. Above, set the value of simonSays to true/false appropriately

	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
 * BONUS! Add a timer : ~~~ where the code starts running ~~~ timeAtStart =
 * newDate();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */


package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		String ray[];
		ray = new String[5];
		ray[0] = "hi";
		ray[1] = "bye";
		ray[2] = "hello";
		ray[3] = "welcome";
		ray[4] = "see you later";
		
		//2. print the third element in the array
		System.out.println(ray[2]);
		//3. set the third element to a different value
		ray[2] = "bye bye";
		//4. print the third element again
		System.out.println(ray[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int x = 0; x<5; x++)
		{
			System.out.println(ray[x]);
		}
		
		//6. make an array of 50 integers
		int rays[];
		rays = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random num = new Random();
		for(int i = 0; i<50; i++)
		{
			int number = num.nextInt(100);
			rays[i] = number;
		}
		
		for(int b = 0; b<50; b++)
		{
			System.out.println(rays[b]);
		}
		
		//8. without printing the entire array, print only the smallest number in the array bubble sort
		for(int c = 0; c < 50; c++)
		{
			for(int d =c+1; d<50; d++)
			{
				if(rays[c]>rays[d])
				{
					int hold = rays[c];
					rays[c] = rays[d];
					rays[d] = hold;
				}
			}
		}
		 
		System.out.println("/n/n/n");
		
		System.out.println(rays[0]);
		
		//9 print the entire array to see if step 8 was correct
		
		/*for(int b = 0; b<50; b++)
		{
			System.out.println(rays[b]);
		}*/
		
		//10. print the largest number in the array. bubble sort
		
		System.out.println(rays[49]);
		
		
		
		
		
		
	}
}