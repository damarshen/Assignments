package Chapter_6;

import java.util.Scanner;

public class Chapter6_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int user = input.nextInt();
		System.out.print(user);
		System.out.println(isPalindrome(user)? " is a palindrome" : " is not apalindrom");

	}
	
	public static int reverse(int number) {
		String a = "";
		String n = number + "";
		for (int i = n.length() - 1; i >= 0; i--) {
			a+= n.charAt(i);
		}
		return Integer.parseInt(a);
	}
	
	public static boolean isPalindrome(int number) {
		boolean palindrome;
		if(number==reverse(number)) {
			palindrome= true;
		}
		else {
			palindrome =false;
		}
		
		return palindrome;
	}
}
