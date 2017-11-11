package Chapter_10.objectClasses;

public class MyInteger {
	
private int value;

public MyInteger(int a) {
	value =a;
}

public int getValue() {
	return value;
}

public boolean isEven() {
	return isEven(value);
}

public boolean isOdd() {
	return isOdd(value);
	
}

public boolean isPrime() {
	return isPrime(value);
}

public static boolean isEven(int value) {
	return value %2 == 0;
}

public static boolean isOdd (int value) {
	return value %2 !=0;
}

public static boolean isPrime(int value) {
	for (int i = 2; i <= value / 2; i++) {
		if (value % i == 0)
			return false;
	}
	return true;
	}

public static boolean isEven (MyInteger a) {
	return a.isEven();
}

public static boolean isOdd (MyInteger a) {
	return a.isOdd();
}

public static boolean isPrime (MyInteger a) {
	return a.isPrime();
	}

public boolean equals(int a) {
	return a == value;
}

public boolean equals (MyInteger a) {
	return a.value == this.value;
}

public static int parseInt (char[] a) {
	int num = Integer.parseInt(new String(a));
	return num;
}

public static int parseInt (String a) {
	int num = Integer.parseInt(a);
	return num;
    }


}



