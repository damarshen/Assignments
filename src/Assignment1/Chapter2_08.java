package Assignment1;

import java.util.Scanner;

/*
 * Revise the program so that it prompts the user to enter the time zone offset to GMT and displays the time in the specified time zone.
 */
public class Chapter2_08 {

	public static void main(String[] args) {
	
		
		long totalMilliseconds = System.currentTimeMillis();
		long currentMillisecond = totalMilliseconds %1000;
		long totalSeconds = totalMilliseconds/1000;
		long currentSecond = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		long currentMinute= totalMinutes%60;
		long totalHours = totalMinutes/60;
		long currentHour = (totalHours)%24;
		System.out.println("Enter the time zone offset to GMT");
		Scanner input = new Scanner(System.in);
		long offset = input.nextLong();
		
		System.out.println("Current time is " + (currentHour + offset) + ":" + currentMinute + ":" + currentSecond + ":" + currentMillisecond);;



	}

}
