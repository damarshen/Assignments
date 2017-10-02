package Chapter_5;

import java.util.Scanner;

public class Chapter5_01 {

	public static void main(String[] args) {
	double posNum=0;
	double negNum=0;
	double total=0;
	double nums=0;
	
	System.out.println("Enter an integer, the input ends if it is 0:");
	Scanner input = new Scanner(System.in);
	
	double number = input.nextDouble();

	if (number == 0) {
		System.out.println("No numbers are entered except 0");
		System.exit(1);
		}
	
	while (number!=0) {
		if (number>0) {
			posNum++;
		}
		else {
			negNum++;
		}
		total+=number;
		nums++;
		number = input.nextDouble();

	}
	double average=total/nums;
	System.out.println("The number of positive numbers is: "+ posNum);
	System.out.println("The number of negative numbers is: "+ negNum);
	System.out.println("the total is: " + total);
	System.out.println("the average is " + average );
	}

}
