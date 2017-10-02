package Chapter_4;

import java.util.Scanner;

public class Chapter4_13 {

	public static void main(String[] args) {
		System.out.println("Enter a letter.");
		Scanner input = new Scanner(System.in);
		String user = input.nextLine();	
		char c = user.charAt(0);
		if (c>=65 && c<=90 || c>=97 && c<=122) {
			if(c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u'||c=='A'|| c=='E'|| c=='I' || c=='O' || c=='U') {
				System.out.println("Letter " + c +" is a vowel.");
			}
			else {
				System.out.println("Letter " + c +" is a consonant");
			}
		}
		else  {
			System.out.println(c +" is an invalid input");
		}
	}

}
