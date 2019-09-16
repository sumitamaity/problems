package Topics;

public class ThreadJoin extends Thread{
public void run() {
	for(int i=0; i<2; i++) {
		try {
			Thread.sleep(1000);
			System.out.println("currentThread"+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
}
