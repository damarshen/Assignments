package Chapter_9.objectClasses;

public class RegularPolygon {

	private int n=3;
	private double side =1;
	private double x=0;
	private double y=0;
	
	public RegularPolygon(){
		n=2;
		side=1;
		x=0;
		y=0;
	}
	
	public RegularPolygon(int a, double b) {
		n=a;
		side=b;
		x=0;
		y=0;
		
	}
	
	public RegularPolygon(int a, double b, double c, double d) {
		n=3;
		side=b;
		x=c;
		y=d;
		
	}
	
	public void setN(int a) {
		n=a;
	}
	
	public int getN() {
		return n;
	}
	
	public void setSide(double a) {
		side =a;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setX(double a) {
		x=a;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double a) {
		y=a;
	}
	
	public double getY() {
		return y;
	}
	
	public double getPerimeter() {
		double perimeter = n * side;
		return perimeter;
	}
	
	public double getArea() {
		double area = (n * Math.pow(side, 2))/ (4*Math.tan((Math.PI/n)));
		return area;
	}
}
