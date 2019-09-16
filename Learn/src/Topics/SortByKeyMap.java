package Topics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortByKeyMap {

	public static void main(String[] args) {
		Map<String, Integer> m= new HashMap<String, Integer>();
		m.put("abc", 1143);
		m.put("vbc", 1289);
		m.put("axc", 125);
		m.put("iamc", 123);
		
		System.out.println("before sorting");
		Set<Entry<String, Integer>> entry=m.entrySet();
		Iterator<Entry<String, Integer>> it= entry.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> e=it.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		System.out.println("after sorting");
		
		Map<String, Integer> sm= new TreeMap<String, Integer>(m);
		Set<Entry<String, Integer>> e1= sm.entrySet();
		for(Entry<String, Integer> e:e1) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}
}
