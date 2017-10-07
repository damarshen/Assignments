package Chapter_7;

import java.util.Scanner;

public class Chapter7_33 {

	public static void main(String[] args) {
			String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
			System.out.print("Enter a year: ");
			Scanner input = new Scanner(System.in);
			int year = input.nextInt();

			System.out.println(year + " is the year of the " + zodiacs[year % 12] + ".");
	}

}
