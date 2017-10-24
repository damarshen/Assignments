package Chapter_9;

import java.util.Scanner;

import Chapter_9.objectClasses.LinearEquation;

public class Chpter9_11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		

		System.out.print("Enter a");
		double a = input.nextDouble();
		System.out.print("Enter b");
		double b = input.nextDouble();
		System.out.print("Enter c");
		double c = input.nextDouble();
		System.out.print("Enter d");
		double d = input.nextDouble();
		System.out.print("Enter e");
		double e = input.nextDouble();
		System.out.print("Enter f");
		double f = input.nextDouble();

		LinearEquation le1 = new LinearEquation(a, b, c, d, e, f);
		
		
		if (le1.isSolvable()) {
			System.out.println("x= " + le1.getX());
			System.out.println("y= " + le1.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}

}
