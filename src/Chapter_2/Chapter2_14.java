package Chapter_2;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
 */
public class Chapter2_14 {

	public static void main(String[] args) {
		System.out.println("Enter wieght in pounds");
		Scanner input = new Scanner(System.in);
		double weightInPounds = input.nextDouble();
		System.out.println("Enter height in inches");
		double heightInInches = input.nextDouble();
		
		double weightInKilos = weightInPounds * 0.45359237;
		double heightInMeters = heightInInches * 0.0254;
		double heightSquared = Math.pow(heightInMeters, 2);
		double BMI = (weightInKilos) / (heightSquared);
		NumberFormat formatter = new DecimalFormat("#0.00");
		System.out.println("BMI is: " + formatter.format(BMI));

	}

}
