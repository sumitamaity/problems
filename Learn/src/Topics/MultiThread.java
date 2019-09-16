package Topics;

public class MultiThread {

	int amount=3000;
	synchronized void payment(int amt) {   //throws java.lang.IllegalMonitorStateException exception while synchronized not used
		if(amount<amt) {
			System.out.println("cannot be withdrawn");
		}
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		amount-=amt;
		System.out.println("transaction successfull");
	}
	
	synchronized void deposit(int amt) {
		amount+=amt;
		System.out.println("deposited!!");
		notify();
	}
	
}

