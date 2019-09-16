package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Sumtotal {
	public static void main(String[] args) {
		
	List<String> li= new ArrayList<String>(); 
	Scanner sc=new Scanner(System.in);{
	System.out.println("enter number of values");
	int n= sc.nextInt();
	
	for(int i=0; i<n; i++) {
		li.add(sc.next());
	}

	Map<String, Integer> m=new HashMap<String, Integer>();
	Iterator<String> it= li.iterator();
	String s1="";
	while(it.hasNext()) {
		s1=it.next();
		if(m.containsKey(s1)) {
			m.put(s1, m.get(s1)+1);
		}else
		{
			m.put(s1, 1);
		}
	}
	
	Set<Entry<String, Integer>> entry= m.entrySet();
	String s="";
	int max=0;
	for(Entry<String, Integer> e:entry) {
		if(e.getValue()>max) {
			max=e.getValue();
			s=e.getKey();
		}
	}
	System.out.println(s+"  "+max);
	
}

}}