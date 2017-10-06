package Chapter_6;

import java.util.Scanner;

public class Chapter6_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		String Str =input.nextLine();
		System.out.println("Enter a letter to look for");
		String str2 =input.nextLine();
		char c = str2.charAt(0);

		
		System.out.println("Thare are "+ count(Str, c) + " instances of the leter '" + c +"' in the word " + Str );
	}

	public static int count(String str, char a) {
		int charCount=0;
		for (int i=0 ; i<str.length(); i++) {
			if (str.charAt(i)== a) {
				charCount++;
			}
		}
		
		return charCount;
	}
	
}
