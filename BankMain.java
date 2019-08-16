package session8;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account b1=new Account(51);
		System.out.println("Start balance is "+b1.getBalance());
		SyncOnlineBank s1=new SyncOnlineBank(b1,false);
		SyncOnlineBank s2=new SyncOnlineBank(b1,false);
		UnsyncBank us1=new UnsyncBank(b1,false);
		UnsyncBank us2=new UnsyncBank(b1,false);
		s1.start();
		s2.start();
		System.out.println("End balance after synchronized is "+b1.getBalance());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		us1.start();
		us2.start();
		
		System.out.println("End balance after unsynchronized is "+b1.getBalance());
	}
	

}
