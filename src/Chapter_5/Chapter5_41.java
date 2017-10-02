package Chapter_5;

import java.util.Scanner;

public class Chapter5_41 {

	public static void main(String[] args) {
	System.out.print("Enter numbers:");	
	Scanner input = new Scanner(System.in);	
	int currentNum = input.nextInt();
	int max=0;
	int count=0;
	
	while (currentNum>0) {
			currentNum = input.nextInt();
			
			if(currentNum>max) {
				max=currentNum;
				count=1;
			}
			if (currentNum==max) {
				count++;
			}
		}
	System.out.println("The largest number is " + max);
	System.out.println("The occurrence count of the largest number is "+count);
	}

}
