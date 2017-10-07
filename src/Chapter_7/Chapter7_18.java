package Chapter_7;

import java.util.Scanner;

public class Chapter7_18 {

	public static void main(String[] args) {
		double[] num = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten num: ");
		
		for (int i = 0; i < num.length; i++) {
		num[i] = input.nextDouble();
			}
		
		bubbleSort(num);

		for (double e: num) {
			System.out.print(e + " ");
		}
		System.out.println();
	}


	public static void bubbleSort(double[] list) {
		double temp;
		boolean swapped;

		do {
			swapped = false; 
			for (int i = 0; i < list.length - 1; i++) {
				
				if (list[i] > list[i + 1]) {
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					swapped = true;
					}
			}
		} 
		
		while (swapped);
	}
}