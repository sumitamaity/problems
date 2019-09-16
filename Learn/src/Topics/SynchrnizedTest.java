package Topics;

public class SynchrnizedTest {
public static void main(String[] args) {
	
	final MultiThread mt= new MultiThread();
	new Thread() {
		public void run() {
			mt.payment(5000);
		}
	}.start();
	
	new Thread() {
		public void run() {
			mt.deposit(5000);
		}
	}.start();
}
}