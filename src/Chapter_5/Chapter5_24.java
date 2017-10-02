package Chapter_5;

public class Chapter5_24 {

	public static void main(String[] args) {
		double numerator =1;
		double denominator = 3;
		double sumDivision=0;
		double sum=0;
		for(int i=1;denominator<=99; i++) {
			sumDivision=numerator/denominator;
			sum+=sumDivision;
			numerator+=2;
			denominator+=2;
		}
		
			System.out.println("Sum of series: " + sum);
			
	}

}
