package Assignment1;
/*
 * Write a program that prompts the user to enter the center x-, y-coordinates, width, and height of two rectangles and determines whether the second rectangle is inside the first or overlaps with the first
 */
import java.util.Scanner;

public class Chapter3_28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter rectangle 1 center x-, y-coordinates, width and height: ");
		double rec1x = input.nextDouble();
		double rec1y = input.nextDouble();
		double rec1W = input.nextDouble();
		double rec1H = input.nextDouble();
		System.out.print("Enter rectangle 2 center x-, y-coordinates, width and height: ");
		double rec2x = input.nextDouble();
		double rec2y = input.nextDouble();
		double rec2W = input.nextDouble();
		double rec2H = input.nextDouble();
		
		if	((Math.pow(Math.pow(rec2y - rec1y, 2), .05) + rec2H / 2 <= rec1H / 2) && 
				(Math.pow(Math.pow(rec2x - rec1x, 2), .05) + rec2W / 2 <= rec1W / 2) &&
				(rec1H / 2 + rec2H / 2 <= rec1H) &&
				(rec1W / 2 + rec2W / 2 <= rec1W))
				System.out.println("Rectanle 2 is inside rectangle 1.");
			else if ((rec1x + rec1W / 2 > rec2x - rec2W) ||
						(rec1y + rec1H / 2 > rec2y - rec2H))
				System.out.println("Rectangle 2 overlaps rectangle 1.");
			else
				System.out.println("Rectangle 2 does not overlap rectangle 1.");

	}

}
