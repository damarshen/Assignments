package Chapter_11.objectClasses;

public class Triangle extends GeometricObject{
private double side1 =1.0;
private double side2=1.0;
private double side3=1.0;

public Triangle() {
	 side1 = 1.0;
	 side2 = 1.0;
	 side3 = 1.0;
}

public Triangle (double a, double b, double c) {
	side1 = a;
	side2 = b;
	side3 = c;
}

public double getArea() {
	double area;
	double s = .5 * (side1 + side2 + side3);
    area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    return area;	
}

public double getPerimeter() {
	double perimeter = side1 + side2 + side3;
	return perimeter;
}

@Override
public String toString() {
	return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
}

}
