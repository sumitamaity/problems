import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class duplicate {

	public void findDup() {
	String s=null;
	int max=0;
	int n;
	Map<String, Integer> hm= new HashMap<String, Integer>();
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);{
		System.out.println("enter number of elements ");
		n=sc.nextInt();
	 for(int i=0 ; i<=n ; i++) {
		s= sc.next();
		if(!hm.containsKey(s))	
	hm.put(s, 1);
		else
			hm.put(s, hm.get(s)+1);
}
	 
	 System.out.println(hm);
	 }
	
	Set<String> set= hm.keySet();{
	for(String s1: set) {
		if(hm.get(s1)>1) {
			if(max<hm.get(s1)) {
				max=hm.get(s1);
			}
			System.out.println("duplicate "+hm.get(s1)+" " +s1);
		}
		
	}
}
	
	Set<Entry<String, Integer>> entry= hm.entrySet();{
		String ch="";
		for(Entry<String, Integer> en: entry) {
			if(max<en.getValue()) {
				max=en.getValue();
				ch=en.getKey();
			}
			}
		System.out.println(ch+"  "+max);
	}
	}
	
	public static void main(String[] args) {
		duplicate dp= new duplicate();
		dp.findDup();
	}
}
