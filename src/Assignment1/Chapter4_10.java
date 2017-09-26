package Assignment1;

import java.util.Scanner;

public class Chapter4_10 {

	public static void main(String[] args) {
		String group1 =
				"1  3  5  7\n9 11 13 15\n17 19 21 23\n25 27 29 31";

			String group2 =
				"2  3  6  7\n10 11 14 15\n18 19 22 23\n26 27 30 31";

			String group3 =
				"4  5  6  7\n12 13 14 15\n20 21 22 23\n28 29 30 31";

			String group4 =
				"8  9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31";

			String group5 = 
				"16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31";

			int date = 0;

			// Create a Scanner
			Scanner input = new Scanner(System.in);

			// Prompt the user to answer questions
			System.out.println("Is your birthdate in group 1?");
			System.out.println(group1);
			System.out.println("Enter y for Yes and n for No: ");
			String s = input.nextLine();
			char answer = s.charAt(0);

			if (Character.toLowerCase(answer) == 'y')
				date += 1;

			// Prompt the user to answer questions
			System.out.println("Is your birthdate in group 2?");
			System.out.println(group2);
			System.out.println("Enter y for Yes and n for No: ");
			s = input.nextLine();
			answer = s.charAt(0);

			if (Character.toLowerCase(answer) == 'y')
				date += 2;

			// Prompt the user to answer questions
			System.out.println("Is your birthdate in group 3?");
			System.out.println(group3);
			System.out.println("Enter y for Yes and n for No: ");
			s = input.nextLine();
			answer = s.charAt(0);

			if (Character.toLowerCase(answer) == 'y')
				date += 4;

			// Prompt the user to answer questions
			System.out.println("Is your birthdate in group 4?");
			System.out.println(group4);
			System.out.println("Enter y for Yes and n for No: ");
			s = input.nextLine();
			answer = s.charAt(0);

			if (Character.toLowerCase(answer) == 'y')
				date += 8;

			// Prompt the user to answer questions
			System.out.println("Is your birthdate in group 5?");
			System.out.println(group5);
			System.out.println("Enter y for Yes and n for No: ");
			s = input.nextLine();
			answer = s.charAt(0);

			if (Character.toLowerCase(answer) == 'y')
				date += 16;

			System.out.println("Your birthdate is " + date);

	}

}
