//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if(randomNumber==0) {
			JOptionPane.showMessageDialog(null, "You're a very nice person!");
		}
		else if(randomNumber==1) {
			JOptionPane.showMessageDialog(null, "You're a very strong person!");
		}
		else if(randomNumber==2) {
			JOptionPane.showMessageDialog(null, "I like your shirt!");
		}
		else if(randomNumber==3) {
			JOptionPane.showMessageDialog(null, "You have a very nice name!");
		}
		else if(randomNumber==4) {
			JOptionPane.showMessageDialog(null, "You're incredibly intelligent!");
		}
		else if(randomNumber==5) {
			JOptionPane.showMessageDialog(null, "You're very athletic!");
		}
		else if(randomNumber==6) {
			JOptionPane.showMessageDialog(null, "I like your hair!");
		}
		else if(randomNumber==7) {
			JOptionPane.showMessageDialog(null, "You're very caring!");
		}
		else if(randomNumber==8) {
			JOptionPane.showMessageDialog(null, "You're a tough person!");
		}
		else {
			JOptionPane.showMessageDialog(null, "How are you so good at everything?");
		}
		
	
		

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
