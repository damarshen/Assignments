package Assignment1;

import java.util.Scanner;

public class Chapter5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of levels between 1 and 15");
		int levels = input.nextInt();
		
		for (int i = 1; i<=levels;i++) {
			
			for (int a=levels-i; a>=1;a--) {
				System.out.print("  ");
				
			}
			for (int b=i; b>=1; b--) {
				System.out.print(b + " ");
			}
			for (int c=2; c<=i;c++) {
				System.out.print(c+ " ");
			}
			System.out.println();
		}
	}

}
