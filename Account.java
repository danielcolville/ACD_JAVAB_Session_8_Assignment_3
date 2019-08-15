package session8;

public class Account {
	private double balance;
	Account(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void withdraw(double amount) {
		balance-=amount;
		
	}
	public void deposit(double amount) {
		balance+=amount;
	}
}
