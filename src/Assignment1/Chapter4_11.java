package Assignment1;

import java.util.Scanner;

public class Chapter4_11 {

	public static void main(String[] args) {
		System.out.println("Enter a decimal value (0 to 15):");
		Scanner input = new Scanner(System.in);
		int decimal = input.nextInt();
		
		String str = Integer.toHexString(decimal);
		System.out.println(str);

	}

}
