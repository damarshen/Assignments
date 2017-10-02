package Chapter_2;
/*
		 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
		 */
import java.util.Scanner;

public class Chapter2_05 {

	public static void main(String[] args) {
		
		
		System.out.print("what is the subtotal?");
		Scanner input= new Scanner (System.in);
		double subtotal = input.nextDouble();
		System.out.print("what is the Gratuity Rate?");
		double gratuity = input.nextDouble();
		
		double gratuityRate = gratuity/100;
		double gratuityOwed = gratuityRate * subtotal;
		
		double total = subtotal + (gratuityOwed);
		
		System.out.print("The gratuity is $" + gratuityOwed + " The total is $" + total );
		
		
		
		
	}

}
