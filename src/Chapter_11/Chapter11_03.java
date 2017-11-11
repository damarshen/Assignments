package Chapter_11;

import Chapter_11.objectClasses.Account;
import Chapter_11.objectClasses.checkingAccount;
import Chapter_11.objectClasses.savingsAccount;

public class Chapter11_03 {
	public static void main(String[] args) {
		Account account = new Account(1545, 500);
		savingsAccount savings = new savingsAccount(558, 200);
		checkingAccount checking = new checkingAccount(52121, 100, -25);
		
		account.setInterest(4);
		savings.setInterest(5);
		checking.setInterest(3.4);
		
		
		account.deposit(50);
		savings.deposit(200);
		checking.deposit(100);
		
		account.withdraw(600);
		savings.withdraw(325);
		checking.withdraw(225);
		
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}
