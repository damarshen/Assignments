package Chapter_10.objectClasses;

import java.util.Date;

public class Account {
	private int id=0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

		public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}
		
		public Account (int a, double b) {
			id = a;
			balance= b;
			dateCreated = new Date();
		}
		
		public void setId(int a) {
			id =a;
		}
		
		public int getId() {
			return id;
		}
		
		public void setBalance(double a) {

			balance=a;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void setInterest(double a) {
			annualInterestRate=a;
		}
		
		public double getInterest() {
			return annualInterestRate;
		}
		
		public String getDate() {
			return dateCreated.toString();
		}
		
		public double getMonthlyInterestRate() {
		double	monthlyInterestRate =annualInterestRate/12;
		return monthlyInterestRate;
		}
		
		public double getMonthlyInterest() {
			double monthlyInterest = (balance *(getMonthlyInterestRate()/100));
			return monthlyInterest;
		}
		
		public void withdraw(double a) {
			balance -= a;
		}
		
		public void deposit (double a) {
			balance+= a;
		}
	

}
