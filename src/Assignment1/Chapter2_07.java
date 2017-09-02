package Assignment1;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the minutes
 */
public class Chapter2_07 {

	public static void main(String[] args) {
		System.out.print("How many minutes?");
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();
		
		int hours = minutes/60;
		int days = hours/24;
		int years = days/365;
		int daysLeft = days%365;
		
		System.out.println(years + " Years and " + daysLeft + " days." );
		
	}

}
