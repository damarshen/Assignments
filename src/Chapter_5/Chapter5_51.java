package Chapter_5;
import java.util.Scanner;

public class Chapter5_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String string1 = input.nextLine();
		System.out.println("Enter the second string: ");
		String string2 = input.nextLine();

		int spot = 0;
		String prefix = "";

		while (string1.charAt(spot) == string2.charAt(spot)) {
			prefix += string1.charAt(spot);
			spot++;
		}

		
		if (prefix.length() > 0)
			System.out.println("The commmon prefix is " + prefix);
		else
			System.out.println(string1 + " and " + string2 + " have no commmon prefix");
	}

}
