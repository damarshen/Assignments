package Chapter_6;

import java.util.Scanner;

public class Chapter6_18 {

	public static void main(String[] args) {
		System.out.println("Enter a password");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		System.out.print(password);
		System.out.println(passwordCheck(password)? " is a valid password" : " is not a valid pasword" );

	}

	
	public static boolean passwordCheck (String one) {
		int numCount=0;
		int charCheckNum=0;
		boolean charCount;
		boolean charCheck ;
		
		
		
		for (int i = 0; i<one.length(); i++ ) {
			
			if (Character.isLetterOrDigit(one.charAt(i))) {
				charCheckNum +=0;
				}
				else{
				charCheckNum+=1;
				}
			
			if (Character.isDigit(one.charAt(i))) {
				numCount++;
			}
		}
		
		
		if(charCheckNum==0){
			charCheck=true;
		}
		else {
			charCheck=false;
		}
		
		if (one.length()<7) {
			charCount=false;
		}
		else {
			charCount =true;
		}
		
	if(charCheck == true && numCount>=2 && charCount == true) {	
		return true;
		
		}
	
	else {
		return false;
		}
	
	}
}
