package Chapter_3;

import java.util.Scanner;

/*Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome number.
*/
public class Chapter3_12 {

	public static void main(String[] args) {
		System.out.println("Enter a three-digit Number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int a = num/100 % 10;
		int b = num/10 % 10; 
		int c = num %10;
		
		if (a==c) {
		System.out.println(num + " is a palindrome.");
		}
		else {
			System.out.println(num + " is not a palindrome.");
		}

	}

}
