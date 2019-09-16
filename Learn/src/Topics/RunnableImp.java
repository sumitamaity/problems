package Topics;

public class RunnableImp implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implementing runnable");
	}

	public static void main(String[] args) {
		RunnableImp ri= new RunnableImp();
		Thread t= new Thread(ri);
		t.start();
	}
}
