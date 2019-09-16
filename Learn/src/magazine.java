import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class magazine {

	public void findSubset(String[] a, String[] b) {
		int count=0;
		int c[]= new int[b.length];
		Map<String, Integer> mp= new HashMap<String, Integer>();
		for(String x: a) {
			if(mp.containsKey(x))
			mp.put(x, mp.get(x)+1);
			else
				mp.put(x,1);
		}
		
		System.out.println(mp);
		for(String y: b) {
			if(!mp.containsKey(y)) {
				System.out.println("NO");
			}
		
		count=mp.get(y);
		
		if(count>0) {
			mp.remove(y);
			System.out.println("yes");
		}else
			mp.put(y, mp.get(y));
			//System.out.println("No");
	}
	}
	public void findSub() {
		String a[]=new String[5];
		String[] b=new String[4];
		int c1;
		int count[]=new int[b.length];
		int res=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first one");
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.next();
		}
		
		System.out.println("enter second one");
		for(int j=0; j<b.length; j++) {
			b[j]=sc.next();
		}
		
		for(int d=0; d<b.length; d++) {
			c1=0;
		for(int c=0; c<a.length; c++) {
		 
			if(b[d].equals(a[c]) && a[c]!="visited") {
				
				//System.out.println("yes");
				c1++;
				//System.out.println(c1);
				a[c]="visited";
				break;
				
			}
		}
		//System.out.println(c1);
		count[d]=c1;
		//System.out.println(c1);
		res=count[d];
		
		 
		}
		 if(res>0) {
			 System.out.println("Yes it is a subset");
		 }
		else {
			//System.out.println(b[d]+" "+a[c]);
			System.out.println("no");
		}
	}
	
	public static void main(String[] args) {
		magazine m= new magazine();
		String[] a=new String[4];
		String[] b= new String[3];
		//m.findSub();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first one");
		for(int i=0; i< a.length; i++) {
			a[i]=sc.next();
		}
		System.out.println("enter second one");
		for(int i=0; i< b.length; i++) {
			b[i]=sc.next();
		}
		m.findSubset(a, b);
		
}}
