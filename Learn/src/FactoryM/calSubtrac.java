package FactoryM;

public class calSubtrac implements commonInterface{

	@Override
	public void calculate(int a, int b) {
		// TODO Auto-generated method stub
		int x= a-b;
		System.out.println("value of the subtraction "+x);
		
	}

}
