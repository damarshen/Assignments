package Chapter_9_09;

import Chapter_9.objectClasses.RegularPolygon;

public class Chapter9 {

	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6,4);
		RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
		 
		System.out.println("Area of polygon 1 is: " + p1.getArea() + ", the perimiter of polygon 1 is " + p1.getPerimeter());
		System.out.println("Area of polygon 2 is: " + p2.getArea() + ", the perimiter of polygon 2 is " + p2.getPerimeter());
		System.out.println("Area of polygon 3 is: " + p3.getArea() + ", the perimiter of polygon 3 is " + p3.getPerimeter());
	}


}
