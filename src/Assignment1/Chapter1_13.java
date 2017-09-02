package Assignment1;
/*
 * Write a program that solves the following equation and displays the value for x and y:
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 */
public class Chapter1_13 {

	public static void main(String[] args) {

		double a = 3.4;
		double b = 50.2;
		double c =2.1;
		double d = .55;
		double e = 44.5;
		double f =5.9;
		double x;
		double y;
		
		x = ((e*d - b*f)/(a*d - b*c));
		y = ((a*f - e*c))/((a*d - b*c));
		System.out.println("solve for the equation: \n3.4x + 50.2y = 44.5 \n2.1x + .55y = 5.9 \n");
		System.out.println("X = " + x + "\nY = "+ y);
	}

}
