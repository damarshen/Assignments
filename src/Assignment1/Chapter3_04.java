package Assignment1;

import java.util.Random;

public class Chapter3_04 {

	public static void main(String[] args) {

		Random rand = new Random();
		int a = rand.nextInt((12 - 123) + 1) + 1;
		if ( a == 1) {
			System.out.println("Month is Januarry");
		}
		else if (a == 2) {
			System.out.println("Month is Feburary");
		}
		else if (a == 3) {
			System.out.println("Month is March");
		}
		else if (a == 4) {
			System.out.println("Month is April");
		}
		else if (a == 5) {
			System.out.println("Month is May");
		}
		else if (a == 6) {
			System.out.println("Month is June");
		}
		else if (a == 7) {
			System.out.println("Month is July");
		}
		else if (a == 8) {
			System.out.println("Month is August");
		}
		else if (a == 9) {
			System.out.println("Month is September");
		}
		else if (a == 10) {
			System.out.println("Month is October");
		}
		else if (a == 11) {
			System.out.println("Month is November");
		}
		else if (a == 12) {
			System.out.println("Month is December");
		}
		
	}

}
