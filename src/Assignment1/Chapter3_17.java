package Assignment1;

import java.util.Random;
import java.util.Scanner;

/*
 * Write a program that plays the popular scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
 * The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws.
 */
public class Chapter3_17 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt((2 - 0) + 1) +0 ;
		System.out.println("Choose Rock (0), Paper (1) or Scissors (2):");
		Scanner input = new Scanner(System.in);
		int b = input.nextInt();
		String outcome1 = "";
		String outcome2 = "";

		
			if (a == 0) {
				outcome1 = "rock";
				}
				else if(a==1) {
				outcome1 = "paper";
				}
				else if (a==2) {
				outcome1 = "scissors";
				}
			
			if (b == 0) {
				outcome2 = "rock";
				}
				else if(b==1) {
				outcome2 = "paper";
				}
				else if (b==2) {
				outcome2 = "scissors";
				}
		
		if (a==b) {
			System.out.println("The computer is " + outcome1 + ". You are " + outcome2 + " too. It is a draw");
		}
		if( a==0 && b==1 ) {
		
		System.out.print("The computer is " + outcome1+ ". You are " + outcome2 + ". You won.");
		}
		if( a==0 && b==2 ) {
			 
			System.out.print("The computer is " + outcome1+ ". You are " + outcome2 + ". You lost.");
			}
		if( a==1 && b==0 ) {
			
			System.out.print("The computer is " + outcome1+ ". You are " + outcome2 + ". You lost.");
			}
		if( a==1 && b==2 ) {
			
			System.out.print("The computer is " + outcome1+ ". You are " + outcome2 + ". You won.");
			}
		if( a==2 && b==0 ) {
			
			System.out.print("The computer is " + outcome1+ ". You are " + outcome2 + ". You won.");
			}
		if( a==2 && b==1 ) {
			
			System.out.print("The computer is " + outcome1+ ". You are " + outcome2 + ". You lost");
			}
	}

}
