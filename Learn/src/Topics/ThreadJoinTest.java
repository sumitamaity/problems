package Topics;

public class ThreadJoinTest {

	public static void main(String[] args) throws InterruptedException {
		ThreadJoin tj= new ThreadJoin();
		ThreadJoin tj1= new ThreadJoin();
		ThreadJoin tj2= new ThreadJoin();
		
		tj.start();
		try {
			tj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj1.start();
		tj1.join();
		tj2.start();
		tj2.join();
		
	}
}
