package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CheckPaliOrNot {

	public static boolean findNumberOfCharOddEven(String input) {
		
		if((input.length())%2==0) {
		System.out.println("it's even ");
		return true;
		}
		else {
		System.out.println("its odd ");	
		return false;
		}
		
	}
	
	
	
	/*
	 * public void numberOfOccureneceChar(String input) { int a[]; char b[] =
	 * input.toCharArray();
	 * 
	 * Map<Character, Integer> m= new HashMap<Character, Integer>(); for(char c:b) {
	 * if(m.containsKey(c)) m.put(c, m.get(c)+1); else m.put(c, m.get(c)); }
	 * 
	 * 
	 * for(Entry entry : m.entrySet()) { System.out.println(entry.getValue());
	 * 
	 * } }
	 */
	
	public void numberOfOccureneceChar(String input) {
		List<Character> as= new ArrayList<Character>();
		for(int i=0; i<as.size(); i++) {
			if(as.contains(input.charAt(i))) {
				as.remove(input.charAt(i));
			}
			else
				as.add(input.charAt(i));
		}
		if(findNumberOfCharOddEven(input)==true&&as.isEmpty()|| findNumberOfCharOddEven(input)==false&& as.size()==1) {
			System.out.println("palindrome"+" :)");
		}
		else
			System.out.println(as+"it can't be palindrome :(");
	}
	
	
		public static void main(String[] args) {
			CheckPaliOrNot cp = new CheckPaliOrNot();
			cp.numberOfOccureneceChar("sumitamaityso");
		}
	}

