package Problems;

public class binaryPali {

	public String getBin(int decimal) {
		StringBuilder str=new StringBuilder();
		int r=0;
		while(decimal>0) {
			r= decimal%2;
			decimal=decimal/2;
			str.append(r);
		}
		System.out.println(str.reverse().toString());
		return str.reverse().toString();
	}
	
	public void checkPali(int a) {
		
		int r=0;
		int sum=0;
		int temp;
		temp=a;
		while(a>0) {
			r=a%10;
			sum=sum*10+r;
			a=a/10;
		}
		if(temp==sum) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}
	
	public static void main(String[] args) {
		binaryPali b= new binaryPali();
		int s=0;
		s=Integer.valueOf(b.getBin(132)); //trailing zeroes are failing the test case 
		System.out.println(s);
		b.checkPali(s);
	}
}
