import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class frequencyMap {
	public void getFreq(List<Integer> a) {
		int max=0;
Map<Integer, Integer> mp= new HashMap<Integer, Integer>();
for(int i=0; i<a.size(); i++) {
	int count=1;
	int ch=a.get(i);
	if(mp.containsKey(a.get(i))) {
		mp.put(ch, count+1);
	}
	else {
		mp.put(ch, count);
	}}
	
	Set<Entry<Integer, Integer>> es= mp.entrySet();{
		int chh=0;
	for(Entry<Integer, Integer> entry:es) {
		if(entry.getValue()>max) {
			max=entry.getValue();
			chh=entry.getKey();
		}
	}
	System.out.println(chh+"    "+max);
}}
	
	
	public static void main(String[] args) {
		

		frequencyMap em=new frequencyMap();
		List<Integer> a= new ArrayList<Integer>();
		@SuppressWarnings("resource")
	int value=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<4;i++) {
			
			value=sc.nextInt();
			a.add(value);
			
		}
		//System.out.println(a);
		em.getFreq(a);
		}
	}