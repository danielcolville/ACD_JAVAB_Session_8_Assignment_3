package session8;

public class SyncOnlineBank extends Thread {
	boolean deposit;
	static Account t;
	SyncOnlineBank(Account t,boolean deposit) {
		this.t=t;
		this.deposit=deposit;
	}
	synchronized static void deposit(double amt) {
		t.deposit(amt);
		//System.out.println("Deposited "+amt+" balance:"+t.getBalance());
	}
	synchronized static void withdrawM(double amount) {
		if(t.getBalance()>amount) {
			t.withdraw(amount);
			//System.out.println("Withdrew "+amount+" balance:"+t.getBalance());
		}
		else {
			System.out.println("Can't withdraw "+amount+" only have "+t.getBalance());
		}
	}
	synchronized public void run() {
		//super.run();
		for(int i=0;i<100;i++) {
			withdrawM(50);
			deposit(50);
			
		
		//for(int j=0;j<100;j++) {
		
		}
	}
}
