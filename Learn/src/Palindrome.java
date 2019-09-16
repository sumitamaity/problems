import java.util.Scanner;

public class Palindrome {

	public void StrPali(String input) {
		String strRev = "";
		char[] c= input.toCharArray();
		for(int i=input.length()-1; i>=0; i--){
			strRev=strRev+input.charAt(i);
			
		}
		
		if(input.equals(strRev)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}
	
	public void IntPali(int input) {
		int sum=0;
		int r=0;
		int temp;
		temp= input;
		
		while(input>0) {
			r= input%10;
			sum=(sum*10) + r;
			input=input/10;
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}
	
	public static void main(String[] args) {
		String s;
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter input :\n");
		//s=sc.nextLine();
		n=sc.nextInt();
		Palindrome p= new Palindrome();
		//p.StrPali(s);
		p.IntPali(n);
	}
	
}
