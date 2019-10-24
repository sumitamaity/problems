package Problems;

import java.util.Scanner;

public class Valley {

	public int  numOfV(String a) {
		int lvl=0;int n=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='U') {
				lvl++;
			}
			else if(a.charAt(i)=='D') {
				lvl--;
			}
			if(lvl==0 && a.charAt(i)=='U') {   // AS WE NEED TO FIND THE NUMBER OF VALLEY ONLY we'll see how many times it is coming up
				n++;						  // lvl should be 0 with U 
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		Valley v= new Valley();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter String "+"\n");
		String s= sc.next();
		System.out.print(v.numOfV(s));
		
	}
}
