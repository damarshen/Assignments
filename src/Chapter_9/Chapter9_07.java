package Chapter_9;

import Chapter_9.objectClasses.Account;

public class Chapter9_07 {

	public static void main(String[] args) {
		Account account1 =new Account(1122, 20000);
		account1.setInterest(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		
		System.out.println("Balance for Account " + account1.getId() + " is $" + account1.getBalance() );
		System.out.println("The monthly Interest for for Account " + account1.getId() + " is $" + account1.getMonthlyInterest());
		System.out.println("Account " + account1.getId() + " was created on" + account1.getDate() );
		

	}


}
