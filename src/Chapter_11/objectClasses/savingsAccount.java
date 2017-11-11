package Chapter_11.objectClasses;

public class savingsAccount extends Account {

	public savingsAccount() {
		super();
	}
	
	public savingsAccount(int a, double b) {
		super(a, b);
	}
	
	@Override
	public void withdraw (double a) {
		if (a-getBalance()<= 0) {
			setBalance(getBalance()-a);
		}
		else {
			System.out.println("Withdrawing $" + a +" will overdraw your account. Your account balnce is: $" + getBalance() + ". Your maximum withdrawl amount is: $" + getBalance());
		}
	}
	
	public String toString() {
		return super.toString();
	}

}
