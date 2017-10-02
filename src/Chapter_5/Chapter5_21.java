package Chapter_5;

import java.util.Scanner;

public class Chapter5_21 {

	public static void main(String[] args) {
		System.out.println("Enter Loan Amount");
		Scanner input = new Scanner(System.in);
		double loan = input.nextDouble();
		System.out.println("Enter Amount of Yeears");
		double years = input.nextDouble();
		System.out.println("Interest Rate    Monthly Rate    Total Payment");
		
		for(double i = 5; i<=8; i+=.125) {
			System.out.printf("%-17.3f", i);
			System.out.printf("%-16.2f",totalOwed(i,loan,years)/(12*years));
			System.out.printf("%-2.2f\n",totalOwed(i,loan,years));
		}
		
	}

	public static double totalOwed (double rate, double principal, double years) {
		double totalLoan = 0;
		double monthlyRate = rate/1200;
		double totalpayments = years*12;
		totalLoan = (monthlyRate*principal)/(1-Math.pow((1+monthlyRate), -totalpayments))*totalpayments;
		
		return totalLoan;
		
		
	}
}
