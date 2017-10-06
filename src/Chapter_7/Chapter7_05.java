package Chapter_7;

import java.util.Scanner;

public class Chapter7_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] distinctList = new int[10];
		int num;
		int count = 0;
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();
			if (distinctCheck(distinctList, num)==true) {
				distinctList[count] = num;
				count++;
				}
			}
			
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctList.length; i++) {
			if (distinctList[i] > 0)
				System.out.print(" " + distinctList[i]);
		}
		System.out.println();
	}
	
	public static boolean distinctCheck(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
	
	
}
