package Chapter_5;

public class Chapter5_18A {

	public static void main(String[] args) {
		System.out.println("Pattern A:");
		for (int i =1; i<=6; i++) {
			for (int j =0 ; j>=1; j--) {
				System.out.println(" ");
			}
			for (int b =1; b<=i; b++) {
			System.out.print(b +" ");
			}
			System.out.println();
		}
		
		System.out.println();

	}

}
