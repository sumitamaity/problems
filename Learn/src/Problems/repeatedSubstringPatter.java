package Problems;

import java.util.Scanner;

public class repeatedSubstringPatter {
	
public static void main(String args[]) {
	
	String s;
	//int count=0;
	Scanner sc = new Scanner(System.in); {
		System.out.println("enter string"+ "\n");
		s=sc.next();
	}
	if(s.length()==1||s==null) {
		System.out.println("not possible");
	}
	for(int i=1; i<s.length();i++) {
		if(s.length()%i==0) {        // the string length should be divisible  by pattern length 
			String pattern=s.substring(0, i);
			String []a=s.split(pattern);     //split the string with pattern
			if(a.length==0) {                 // array should be of length zero
				System.out.println("can be substring");
				
			}
				
	}
		
}
//System.out.println(s.length()/count + " times the pattern has repeated ");	
}}
