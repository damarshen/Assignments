package Chapter_2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area. The formula for computing the area of a triangle is
 */
public class Chapter2_19 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter three points for a triangle:");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double x3 = input.nextDouble();
	double y3 = input.nextDouble();
	
	double side1 = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2)), .5);
	double side2 = Math.pow((Math.pow(x3 - x2, 2) + Math.pow(y3-y2, 2)), .5);
	double side3 = Math.pow((Math.pow(x1 - x3, 2) + Math.pow(y1-y3, 2)), .5);
	double s = (side1 + side2 + side3) / 2 ;
	double area = Math.pow(s * (s-side1) * (s-side2) * (s-side3), .5);
	NumberFormat formatter = new DecimalFormat("#0.00");
	System.out.println("The area of this triangle is: " + formatter.format(area));
	}

}