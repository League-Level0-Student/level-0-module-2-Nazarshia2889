package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog(null, "How tall are you in inches?: ");
		int decision = Integer.parseInt(height);
		if(decision>48) {
			JOptionPane.showMessageDialog(null, "Looks like you're tall enough to ride the roller coaster!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You'll need to grow more first before riding this roller coaster");
		}
			
	}
}
