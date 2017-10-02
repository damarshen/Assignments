package Chapter_5;

public class Chapter5_18B {

	public static void main(String[] args) {
		System.out.println("Pattern B:");
		for (int i =6; i>=1; i--) {
			for (int j =6 ; j>=1; j--) {
				System.out.print("");
			}
			for (int b =i; b>=1; b--) {
			System.out.print(b +" ");
			}
			System.out.println();
		}

	}

}
