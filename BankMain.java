package session8;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account b1=new Account(750);
		for(int i=0;i<100;i++) {
			
			if(i%2==0) {
				SyncOnlineBank t=new SyncOnlineBank(b1,500,false);
				t.start();
			}
			else {
				SyncOnlineBank t=new SyncOnlineBank(b1,500,true);
				t.start();
			}
			
		}
		
		System.out.println(b1.getBalance());
	}
	

}
