package Chapter_5;

public class Chapter5_18C {

	public static void main(String[] args) {
		System.out.println("Pattern C");
		int levels = 6;
		for(int i=1; i<=levels; i++) {
			for (int j=1; j<=(levels-i); j++) {
				System.out.print("  ");
			}
			for (int k =1 ;k<=i; k++) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}

	}

}
