package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
		Random ran = new Random();
		int randomNumber = 0;
		randomNumber = ran.nextInt(40);
		JOptionPane.showMessageDialog(null, randomNumber);
		
		randomNumber = ran.nextInt(40);
		JOptionPane.showMessageDialog(null, randomNumber);
		
		randomNumber = ran.nextInt(40);
		JOptionPane.showMessageDialog(null, randomNumber);
		
		randomNumber = ran.nextInt(40);
		JOptionPane.showMessageDialog(null, randomNumber);
		
		randomNumber = ran.nextInt(40);
		JOptionPane.showMessageDialog(null, randomNumber);
		
		
		
	}

}
