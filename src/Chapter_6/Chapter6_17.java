package Chapter_6;

import java.util.Scanner;

public class Chapter6_17 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		printMatrix(number);

	}

	
	public static void printMatrix(int n) {
		for (int i=0; i<n ; i++) {
			for (int j=0 ; j<n; j++) {
				System.out.print((int)Math.round( Math.random()) +"");
				}
			System.out.println();
		}
		
		
	}
}
