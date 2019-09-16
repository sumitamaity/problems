package FactoryM;

public class AppsTest {

	public void invoke(commonInterface ci) {
		int a = 0, b = 0;
		if(ci instanceof calAdd) {
			ci.calculate(a, b);
		}
		else if (ci instanceof calSubtrac) {
			ci.calculate(a, b);
		}
		
		else if(ci instanceof calMul) {
			ci.calculate(a, b);
		}
		else
			System.out.println("we don't take this request");
	}
	
	
	public static void main(String[] args) {
		commonInterface c= new calSubtrac();
		c.calculate(9, 2);
		
		commonInterface m= new calMul();
		m.calculate(9, 2);
		
	}
}
