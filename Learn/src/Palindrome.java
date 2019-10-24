import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Palindrome {
	
	public static boolean checkPalindrome(String str) {
		String a="";
		for(int i=str.length()-1; i>=0; i--) {
		a=a+str.charAt(i);	
		
		}
		//System.out.println(a);
		if(str.equals(a)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void checkSubSetPali() {
		String a="DADAD";
		int count=0;
		Set<String> s1= new LinkedHashSet<String>();
		//System.out.println(checkPalindrome(a));
	    for(int i=0; i<=a.length();i++) {
	    	for(int j=i+1; j<a.length();j++) {
	    		String s= a.substring(i,j);
	    		boolean a1=checkPalindrome(a.substring(i,j));
	    	if(checkPalindrome(a.substring(i,j))) {
	    		count++;
	    		s1.add(a.substring(i,j));
	    		//System.out.println(a.substring(i,j));
	    	}
	    	
	    }
	    	
	}
	    System.out.println("total number of subsets "+count);
	    System.out.println(s1);
	    System.out.println("unique subsets "+s1.size());
	    
	}


	public void StrPali(String input) {
		String strRev = "";
		char[] c= input.toCharArray();
		for(int i=input.length()-1; i>=0; i--)
		{
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
