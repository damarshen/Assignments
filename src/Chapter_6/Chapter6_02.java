package Chapter_6;

import java.util.Scanner;

public class Chapter6_02 {

	public static void main(String[] args) {
		System.out.println("Enter an integer");
		Scanner input=new Scanner(System.in);
		int digits = input.nextInt();
		
		System.out.println("The sum of the digits in the number " + digits + " is: " + sumDigits(digits) );

	}

	public static int sumDigits (int a) {
		int sum =0;
		while (a>0) {
			sum+= a % 10;
			a=a/10;
		}
		
		return sum;
	}
}
