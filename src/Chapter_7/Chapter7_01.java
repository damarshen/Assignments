package Chapter_7;

import java.util.Scanner;

public class Chapter7_01 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter number of students");
		int [] students = new int [input.nextInt()];
		int [] scores = new int [students.length];
		char[] grades =new char [students.length] ;
		System.out.println("Enter " + scores.length + " Scores");
		
		for (int i=0; i<scores.length; i++) {
			scores[i]=input.nextInt();
			
		}
		
		grader(scores, grades);
		
		for (int i=0; i<students.length; i++) {
			System.out.println("Student "+i+ "'s score is " + scores[i]+ " with a grade of " + grades[i]);
		}

	}

	public static int highScore(int[] array) {
		int highScore= array[0];
		for (int i=0; i<array.length; i++) {
			if (array[i]>=highScore) {
				array[i]=highScore;
			}
		}
		
		return highScore;
	}
	
	public static void grader(int[] scores, char[] grades) {
		int curve = highScore(scores);
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= curve-10) {
				grades[i] = 'A';}
			else if (scores[i] >= curve-20) {
				grades[i] = 'B';}
			else if (scores[i] >= curve-30) {
				grades[i] = 'C';}
			else if (scores[i] >= curve-40) {
				grades[i] = 'D';}
			else {
				grades[i] = 'F';}
		}
	} 
	
}
