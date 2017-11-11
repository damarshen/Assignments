package Chapter_10;

import Chapter_10.objectClasses.MyInteger;

public class Chapter10_03 {

	public static void main(String[] args) {
		int [] nums = {5,3,8,9,4,6,};
		
		
			//checks if array entry is even using isEven(int)
		System.out.println("\nchecks if array entry is Even using isEven(int)");
	
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
			System.out.println(MyInteger.isEven(nums[i])? "Is even" : "Is not even");
		}
		
		System.out.println("\nchecks if array entry is odd using isOdd(int)");
		
		//checks if array entry is odd using isOdd(int) 
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
			System.out.println(MyInteger.isOdd(nums[i])? "Is odd" : "Is not odd");
		}

		
		System.out.println("\nchecks if array entry is prime using isPrime(int)");
		
		//checks if array entry is prime using isPrime(int) 
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
			System.out.println(MyInteger.isPrime(nums[i])? "Is Prime" : "Is not Prime");
		}
		
		System.out.println("\nchecks if number entry even using isEven(MyInteger):");
		//checks if number entry is even using isEven(MyInteger) 
		for (int i = 0; i < nums.length; i++) {
			MyInteger number = new MyInteger(nums[i]);
			System.out.print(number.getValue()+ " ");
			System.out.println(MyInteger.isEven(number)? "Is even" : "Is not even");
		}

		System.out.println("\nchecks if number entry odd using isOdd(MyInteger):");
		//checks if number entry is even using isOdd(MyInteger) 
		for (int i = 0; i < nums.length; i++) {
			MyInteger number = new MyInteger(nums[i]);
			System.out.print(number.getValue()+ " ");
			System.out.println(MyInteger.isOdd(number)? "Is odd" : "Is not odd");
		}

		System.out.println("\nchecks if number entry prime using isPrime(MyInteger):");
		//checks if number entry is Prime using isPrime(MyInteger) 
		for (int i = 0; i < nums.length; i++) {
			MyInteger number = new MyInteger(nums[i]);
			System.out.print(number.getValue()+ " ");
			System.out.println(MyInteger.isPrime(number)? "Is prime" : "Is not prime");
		}
		
		MyInteger compare= new MyInteger(8); //number to compare if equal
		
		//checks if array entry is equal to comparison number using equals(int)
		System.out.println("\nTest if " + compare.getValue() + "comparison number using equals(int)");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+ " ");
			System.out.println(compare.equals(nums[i])? "equals " + compare.getValue() : "is not equal to " + compare.getValue());
		}
		
		//checks if array entry is equal to comparison number using equals(MyInteger)
				System.out.println("\nTest if " + compare.getValue() + "comparison number using equals(MyInteger)");
				for (int i = 0; i < nums.length; i++) {
					MyInteger number = new MyInteger(nums[i]);
					System.out.print(number.getValue()+ " ");
					System.out.println(compare.equals(number)? "equals " + compare.getValue() : "is not equal to " + compare.getValue());
				}
				
		// checks parseInt(char[])
			System.out.println("\nTest parseInt(char[])");
			char[] chars = {'4', '7', '6'};
			System.out.println((MyInteger.parseInt(chars)));

			// checks parseInt(char[])
				System.out.println("\nTest parseInt(String");
				String string = "558";
				System.out.println((MyInteger.parseInt(string)));
	}

}
