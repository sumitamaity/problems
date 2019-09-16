package Problems;

import java.util.Scanner;

public class AlternateChar {

	//remove character which are same and adjacent to each other
	public void makeAlter(String s) {
		int count=0;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		AlternateChar a = new AlternateChar();
		String s="";
		System.out.println("enter number of cases"+"\n");
		int numOfCases;
		Scanner sc= new Scanner(System.in);
		numOfCases=sc.nextInt();
		for(int i=1; i<=numOfCases; i++) {
	    s= sc.nextLine();	
	    a.makeAlter(s);

		}
		
	}
}
