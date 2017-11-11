package Chapter_11.objectClasses;

public class checkingAccount extends Account {
private double overdraftLimit;
	public checkingAccount() {
		super();
	}
	
	public checkingAccount(int a, double b, double overdraftLimit) {
		super(a , b);
		this.overdraftLimit=overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double a) {
		if (a-getBalance()>= overdraftLimit) {
			setBalance(getBalance()-a);
		}
		else {
			System.out.println("Withdrawing $" + a +"will overdraw your account. Your account balnce is: $" + getBalance() + ". Your maximum withdrawl amount is: $" + (getBalance()+25));
		
		}
	}
	
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + getOverdraftLimit();
	}
	
}
