package Chapter_9.objectClasses;

public class Rectangle {
		public double width = 1;
		public double height =1;
		
		public Rectangle() {
			width=1;
			height=1; 
		}
		public Rectangle(double a, double b) {
			width=a;
			height=b;
		}
		public double getArea() {
			double area =width*height;
			return area;
		}
		public double getPerimiter() {
			double peremiter = (width*2)+(height*2);
			return peremiter;
		}
}
