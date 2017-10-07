package Chapter_7;

import java.util.Scanner;

public class Chapter7_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter the number of students: ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];

		System.out.println("Enter the name a score for each student:");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student " + i+ ":");
			students[i] = input.next();
			System.out.print("Score:");
			scores[i] = input.nextInt();
		}

		
		sort(students, scores);

		for (String e: students) {
			System.out.println(e);
		}
	}

	
	public static void sort(String[] strs, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			int maxInd = i;
			String temp;

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > max) {
					max = nums[j];
					maxInd = j;
				}
			}
			
			if (maxInd != i) {
				temp = strs[i];
				strs[i] = strs[maxInd];
				strs[maxInd] = temp;
				nums[maxInd] = nums[i];
				nums[i] = max;
			}
		}
	}
}