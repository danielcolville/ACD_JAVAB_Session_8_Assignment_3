package session8;

public class SyncOnlineBank extends Thread {
	//double balance;
	boolean deposit;
	double amt;
	static Account t;
	SyncOnlineBank(Account t,double amt,boolean deposit) {
		this.t=t;
		this.amt=amt;
		this.deposit=deposit;
	}
	synchronized static void deposit(double amt) {
		t.deposit(amt);
		System.out.println("Deposited "+amt+" balance:"+t.getBalance());
	}
	synchronized static void withdrawM(double amount) {
		if(t.getBalance()>amount) {
			//balance-=amount;
			t.withdraw(amount);
			System.out.println("Withdrew "+amount+" balance:"+t.getBalance());
		}
		else {
			System.out.println("Can't withdraw "+amount+" only have "+t.getBalance());
		}
	}
	synchronized public void run() {
		//super.run();
		synchronized(t) {
		if(deposit) {
			deposit(amt);
		}
		else {
			withdrawM(amt);
		}
		}
	}
}
