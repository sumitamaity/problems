package Problems;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AlternateChar {

	public void makeAlterMap(String s) {
		Set<Character> set= new LinkedHashSet<Character>();
	 for(int i=0; i<=s.length(); i++) {
		set.add(s.charAt(i));
	}
	 System.out.println(set);
	}
	//remove character which are same and adjacent to each other
	public void makeAlter(String s) {
		char[] f= new char[s.length()];
		int count=0;
		String s1="";
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
				f[i]='a';
			}else {
				s1=s1+s.charAt(i);
			}
			
		}
		
		System.out.println(count);
		System.out.println(s1);
		
	}
	
	public static void main(String[] args) {
		AlternateChar a = new AlternateChar();
		String s="";
		System.out.println("enter number of cases"+"\n");
		
		Scanner sc= new Scanner(System.in);
		
		
	    s= sc.nextLine();
	    a.makeAlter(s);
	    a.makeAlterMap(s);

		}
		
	}
