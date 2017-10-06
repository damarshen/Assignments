package Chapter_6;

import java.util.Scanner;

public class Chapter6_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numberss: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		displaySortednumbers(num1, num2, num3);
	}
	public static void displaySortednumbers(double num1, double num2, double num3) {
double empty;
		
		if (num2 < num1 && num2 < num3){
			empty = num1;
			num1 = num2;
			num2 = empty;
		}
		else if (num3 < num1 && num3 < num2) {
			empty = num1; 
			num1 = num3;
			num3 = empty;
		}
		else if (num3 < num2) {
			empty = num2;
			num2 = num3;
			num3 = empty;
		}
		
		System.out.println("the numberss in increasing order are: " + num1 + ", " + num2 + ", " + num3);
	}
}
