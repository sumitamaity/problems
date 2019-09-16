package Problems;

import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {
		String str="";
		Scanner sc= new Scanner(System.in);{
		System.out.println("enter string "+ "\n");
		
		str=sc.nextLine();
		returnnumber(str);
	}	
	}
	
  public static void returnnumber(String input) {
	  
	  String a[]=input.split("[.+]]");
	  for(int i=0; i<a.length; i++)
	  System.out.println(a[i]);
	  System.out.println(a.length);
  }

}