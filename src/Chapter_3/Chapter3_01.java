package Chapter_3;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation has no real roots”.
 */
public class Chapter3_01 {

	public static void main(String[] args) {
	
		System.out.println("Enter a, b, c:");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double bsqrd = Math.pow(b, 2);
		double discriminant = Math.pow(b, 2) -4*(a*c) ;
		
		double r1 = (-b + Math.pow( ( bsqrd - 4*(a*c) ), .5)) /(2*a) ;
		double r2 = (-b - Math.pow( ( bsqrd - 4*(a*c) ), .5)) /(2*a) ;

		if (discriminant > 0) {
			System.out.println("The equation has two roots: " + r1 + " and " + r2 );
		}
		else if (discriminant == 0 ) {
			System.out.println("The equation has one root: "  + r1);
		}
		else if (discriminant < 0) {
			System.out.println("The equation has no real roots");
		}

	}

}
