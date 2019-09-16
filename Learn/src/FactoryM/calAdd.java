package FactoryM;

public class calAdd implements commonInterface{

	@Override
	public void calculate(int a , int b) {
		// TODO Auto-generated method stub
		int x= a+b;
		System.out.println("value of the addition " + x);
	}

	
}
