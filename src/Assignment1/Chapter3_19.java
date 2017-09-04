package Assignment1;

/*
 * Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid.
 */
import java.util.Scanner;
public class Chapter3_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length for side A");
		double a = input.nextDouble();
		System.out.println("Enter length for side B");
		double b = input.nextDouble();
		System.out.println("Enter length for side C");
		double c = input.nextDouble();
		
		if(a>b && a>c) {
			if ((c+b)>a) {
				System.out.print("The perimeter of the trainagle is:" + (a+b+c));
			}
			else {
				System.out.print("Input is invalid. Sum of sides B and C must be larger than side A");
			}
		}
		
		if(b>a && b>c) {
			if ((c+a)>b) {
				System.out.print("The perimeter of the trainagle is:" + (a+b+c));
			}
			else {
				System.out.print("Input is invalid. Sum of sides A and C must be larger than side B");
			}
		}
		
		if(c>a && c>b) {
			if ((a+b)>c) {
				System.out.print("The perimeter of the trainagle is:" + (a+b+c));
			}
			else {
				System.out.print("Input is invalid. Sum of sides A and B must be larger than side C");
			}
		}
	}

}
