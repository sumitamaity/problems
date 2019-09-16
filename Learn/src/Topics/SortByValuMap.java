package Topics;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortByValuMap {

	public HashMap sortinjavasev() {
		Map<String, Integer> mp= new HashMap<String, Integer>();
		mp.put("abc", 12);
		mp.put("vbc", 712);
		mp.put("mbc", 912);
		
		List li= new LinkedList(mp.entrySet());
		Collections.sort(li, new Comparator() {

			@SuppressWarnings("unchecked")
			@Override
			public int compare(Object o1, Object o2) {
				
				// TODO Auto-generated method stub
				return  ((Comparable) ((Map.Entry) (o1)).getValue())
		                  .compareTo(((Map.Entry) (o2)).getValue());
			}
			
		});
		 HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = li.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap; 
	}
	}
