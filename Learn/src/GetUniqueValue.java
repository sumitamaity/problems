import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GetUniqueValue {

	
	public Set<Character> getValueUsingSet(String s) {
		char[] c= s.toCharArray();
		StringBuilder sb= new StringBuilder();
		//StringBuilder sc= new StringBuilder();
		Set<Character> ch= new HashSet<Character>();
		for(int i=0; i< s.length(); i++) {
			ch.add(c[i]);
		}
		
		Iterator<Character> it= ch.iterator();
		while(it.hasNext())
		sb=sb.append(it.next());
		/*
		 * s=sb.toString(); s=s.substring(0, 0).toUpperCase();
		 */
		System.out.println(ch);
		
		System.out.println(sb.toString().substring(0,1).toUpperCase().concat(sb.toString().substring(1).concat(".")));
		
		return ch;
		
	}
	
	public void getVakueUsingArray(String s) {
		
		String str = new String();
		//StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			//char b= s.charAt(i);
					if(str.indexOf(s.charAt(i))<0) {
					str=str + s.charAt(i);
					//sb.append(b);
			}
			
		}
		System.out.println(str);
		//System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		GetUniqueValue guv= new GetUniqueValue();
		guv.getValueUsingSet("sumitamaity");
		guv.getVakueUsingArray("payalmaity");
		
	}
}
