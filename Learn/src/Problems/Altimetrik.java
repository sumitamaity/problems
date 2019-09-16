package Problems;

import java.util.Arrays;

public class Altimetrik {

	public void returnString(String s) {
		String s1= s.substring(0, s.length()-1);
		String[] a =s1.split("\\s");
		String s3="";
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i].length()> a[j].length()) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//Arrays.sort(a); ---doesn't work
		String s2=a[0].substring(0,1).toUpperCase()+a[0].substring(1);
		for(int i=1; i<a.length;i++) {
			s3=s3+" "+a[i];
		}
	    System.out.println(s2+s3+".");
	    System.out.println(s1);
	}
	
	public static void main(String[] args) {
		Altimetrik al= new Altimetrik();
		al.returnString("sumita is from Hyderabad.");
	}

	
}
