package Assignment1;

import java.util.Scanner;

public class Chapter4_21 {

	public static void main(String[] args) {
		System.out.println("Enter social security number in the format: ###-##-####");
		Scanner input = new Scanner(System.in);
		String ssNumber = input.nextLine();
		boolean valid =
				(ssNumber.length() == 11) && 
				(Character.isDigit(ssNumber.charAt(0))) &&
				(Character.isDigit(ssNumber.charAt(1))) &&
				(Character.isDigit(ssNumber.charAt(2))) &&
				(ssNumber.charAt(3) == '-') &&
				(Character.isDigit(ssNumber.charAt(4))) &&
				(Character.isDigit(ssNumber.charAt(5))) &&
				(Character.isDigit(ssNumber.charAt(7))) &&
				(ssNumber.charAt(6) == '-') &&
				(Character.isDigit(ssNumber.charAt(8))) &&
				(Character.isDigit(ssNumber.charAt(9))) &&
				(Character.isDigit(ssNumber.charAt(10)));
		if (valid) {
			System.out.println(ssNumber +" is a valid social security number");
		}
		else {
			System.out.println(ssNumber +" is not a valid social security number");
		}
		
		}
		
	}


