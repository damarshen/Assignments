package Chapter_6;

public class Chapter6_10 {

	public static void main(String[] args) {
		int primeCount=0;
		for (int i=1 ; i<1000; i++) {
			if (isPrime(i)){
				primeCount++;
			}
		}

		System.out.println("The number of prime numbers between 1 and 1000 is: " + primeCount);
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number/2; divisor++) {
			if (number % divisor == 0) {
				return false; 
			}
		}

		return true;
	}
	
}
