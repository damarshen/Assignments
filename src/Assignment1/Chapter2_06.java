package Assignment1;

import java.util.Random;

public class Chapter2_06 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.
		 */
		Random rand = new Random();
		int a = rand.nextInt(1000)+1;
		int b = a %10;
		int c = a/10 % 10;
		int d = a/100 % 10;
		int e = a/1000 % 10;
		
		System.out.println("Number is: " + a);
		
		if (a == 1000) {
			System.out.println(e + " + " + d + " + " + c + " + " + b + " = " + (e+b+c+d) );
		}
		else if (a>99 && a<1000){
			System.out.println(d + " + " + c + " + " + b + " = " + (b+c+d) );
		}
		 
		else if (a<99) {
			 System.out.println(c + " + " + b + " = " + (b+c) );
		 }
	}

	
}
