package Assignment1;

import java.util.Scanner;

public class Chapter4_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code:");
		int n = input.nextInt();
		
		System.out.println("The character for the ASCII code is:" + (char)n);
	}

}
