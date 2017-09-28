package Assignment1;

import java.util.Scanner;

public class Chapter5_09 {

	public static void main(String[] args) {
		int score = 0;
		int highScore1 = 0;
		int highScore2 =0;
		String name = "";
		String highName1 = "";
		String highName2 = "";
		System.out.println("Enter number of students");
		Scanner input = new Scanner(System.in);
		int students = input.nextInt();
		
		for (int i=0; i<students; i++) {
			System.out.println("Enter student name ");
			name = input.next();
			
			System.out.println("Enter " + name + "'s Score:");
			score = input.nextInt();
			
			if (i==0) {                                                             
				highName1=name;
				highScore1 =score;
			}
			else if (i==1) {
				highName2 = name;
				highScore2 = score;
			}
			
			else if (i>1 && score>highScore1 && score>highScore2) {
				highName1=name;
				highScore1=score;
				
			}
			else if(i>1 && score<highScore1 && score>highScore2) {
				highName2=name;
				highScore2=score;
			}
			
		}
		System.out.println("Highst Scoring Student is " + highName1 + " and their score is " + highScore1 + ".");
		System.out.println("Highst Scoring Student is " + highName2 + " and their score is " + highScore2 +  ".");
	}

}
