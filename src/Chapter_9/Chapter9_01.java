package Chapter_9;

import Chapter_9.objectClasses.Rectangle;

public class Chapter9_01 {
	public static void main(String[] args) {
		Rectangle R1 =new Rectangle(4, 40.0);
		Rectangle R2 =new Rectangle(3.5, 35.9); 
		System.out.println("Rectangle 1 Width: " + R1.width+ ", Height: " + R1.height + ", Area: " + R1.getArea() + ", Perimiter: " + R1.getPerimiter());
		System.out.println("Rectangle 2 Width: " + R2.width+ ", Height: " + R2.height + ", Area: " + R2.getArea() + ", Perimiter: " + R2.getPerimiter());
		
	}
}
