package Chapter_10;

import java.util.Scanner;

import Chapter_10.objectClasses.Account;

public class chapter10_07 {

	public static void main(String[] args) {
		int option;
		Scanner input= new Scanner(System.in);
		Account [] accounts = new Account[10];
		newBalance(accounts);
		
		
		
		do {
			System.out.println("Enter ID#");
			int Id =input.nextInt();
			
			if (checkId(Id,accounts)){
				
				do { 
					option = mainMenu(input);
					if(option>0 && option<4) {
						transaction(option, accounts, Id, input);
					}

				} while (option != 4);
			}
			
		} while (true);
		
		
	}


	public static void newBalance (Account [] a) {
		
		for (int i=0; i<a.length; i++) {
			a[i]= new Account(i,100);
		}
		
	}
	
	public static boolean checkId(int a, Account[] b) {
		for (int i=0; i<b.length; i++) {
			if(a==b[i].getId()) {
				return true;
			}
		}
		return false;
	}
	
	public static int mainMenu(Scanner input) {
		
		System.out.println("Main menu:");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		return input.nextInt();
	}
	
	public static void transaction(int a, Account[]b, int c, Scanner input  ) {
		switch(a) {
		case 1: System.out.println("Your balance is: $" + b[c].getBalance()+ "\n");
		break;
		
		case 2: System.out.println("Enter amount to Withdraw" +"\n");
		b[c].withdraw(input.nextDouble());
		break;
		
		case 3:System.out.println("Enter amount to Deposit" +"\n");
		
		b[c].deposit(input.nextDouble());
		}
		
	}
	
}
