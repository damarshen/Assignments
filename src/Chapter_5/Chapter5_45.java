package Chapter_5;

import java.util.Scanner;

public class Chapter5_45 {

	public static void main(String[] args) {
		double numbers=10;
		double sum=0;
		double mean=0;
		double numberEntered=0;
		double deviation=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Numbers");
		for (int i=0; i<10;i++) {
			numberEntered=input.nextDouble();
			sum+=numberEntered;
			deviation += Math.pow(numberEntered, 2);
		}
		
		mean =sum/numbers;
		deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));
		
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is "+ deviation);
	}

}
