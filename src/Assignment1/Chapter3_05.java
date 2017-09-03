package Assignment1;
/*
 * (Find future dates) Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
 */
import java.util.Scanner;

public class Chapter3_05 {

	public static void main(String[] args) {
		System.out.println("Enter Todays Day: ");
		Scanner input = new Scanner(System.in);
		int currentDay = input.nextInt();
		System.out.println("Enter the number of dayw elapsed since today:" );
		int elapsedDays =input.nextInt();
		String day1 = "";
		String day2 = "";
		int futureDate = currentDay + elapsedDays;
		
			if(futureDate > 6) {
				futureDate = (currentDay + elapsedDays) %7;
			}
		
		if (currentDay == 0) {
			day1 = "Sunday";
		}
		else if (currentDay == 1) {
			day1 = "Monday" ;
		}
		else if (currentDay == 2) {
			day1 = "Tuesday" ;
		}
		else if (currentDay == 3) {
			day1 = "Wednesday" ;
		}
		else if (currentDay == 4) {
			day1 = "Thursday" ;
		}
		else if (currentDay == 5) {
			day1 = "Friday" ;
		}
		else if (currentDay == 6) {
			day1 = "Saturday" ;
		}
		
		
		if (futureDate == 0) {
			day2 = "Sunday";
		}
		else if (futureDate == 1) {
			day2 = "Monday" ;
		}
		else if (futureDate == 2) {
			day2 = "Tuesday" ;
		}
		else if (futureDate == 3) {
			day2 = "Wednesday" ;
		}
		else if (futureDate == 4) {
			day2 = "Thursday" ;
		}
		else if (futureDate == 5) {
			day2 = "Friday" ;
		}
		else if (futureDate == 6) {
			day2 = "Saturday" ;
		}
		
		System.out.println("Today is " + day1 + " and the future date is " + day2 );
		 
	} 




}
