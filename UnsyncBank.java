package session8;

public class UnsyncBank extends Thread {
	boolean deposit;
	static Account t;
	UnsyncBank(Account t,boolean deposit) {
		this.t=t;
		this.deposit=deposit;
	}
	static void deposit(double amt) {
		t.deposit(amt);
	}
	static void withdrawM(double amount) {
		if(t.getBalance()>amount) {
			t.withdraw(amount);
		}
		else {
			System.out.println("Can't withdraw "+amount+" only have "+t.getBalance());
		}
	}
	synchronized public void run() {
		for(int i=0;i<100;i++) {
			withdrawM(50);
			deposit(50);	
		}
	}
}