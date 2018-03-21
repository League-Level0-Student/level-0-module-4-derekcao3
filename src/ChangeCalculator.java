//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Jacob = JOptionPane.showInputDialog("How many nickles?");
		// Convert their answer to an int using Integer.parseInt()
		int jacoby = Integer.parseInt(Jacob);
		// Ask the user how many dimes they have, and convert their answer
		String no = JOptionPane.showInputDialog("How many dimes?");
		int jacobz = Integer.parseInt(no);
		// Ask the user how many quarters they have, and convert their answer
		String yes = JOptionPane.showInputDialog("How many quaters?");
		int jacobi = Integer.parseInt(yes);
		// Calculate how much money the user has and save it in a double variable
		double money = 0.0;
		money += .05 * jacoby + jacobz * 0.1 + jacobi * 0.25;
		
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have " + money + "$");
		
	}
}
