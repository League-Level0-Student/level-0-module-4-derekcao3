
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		int isWeekday, isVacation;
		int yes=0,no =1;
		/*
		 * Ask the user for these values using
		 */

		isWeekday = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		System.out.println(isWeekday);
		isVacation = JOptionPane.showConfirmDialog(null, "are we on vacation", "", JOptionPane.YES_NO_OPTION);
		System.out.println(isVacation);
		if (isWeekday == yes && isVacation == no) {
			JOptionPane.showMessageDialog(null, "get up lazybones");
		} else if (isVacation == yes) {
			JOptionPane.showMessageDialog(null, "sleep in");
		}
		 else if (isWeekday == yes) {
			JOptionPane.showMessageDialog(null, "get up lazybones");
		 }

		/*
		 * Print "sleep in" if it is a vacation or a weekend. If it's a weekday, print
		 * "get up lazybones!" If it is a weekday, and we are on vacation, print
		 * "sleep in".
		 */
	
	}
}
