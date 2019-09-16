package Problems;

import java.util.HashSet;
import java.util.Set;

public class FindPairs {

	public int findP(int a[]) {
		int pair=0;
		Set<Integer> s= new HashSet<Integer>();
		for(int i=0; i< a.length; i++)
		if(s.contains(a[i])) {
			pair++;
			s.remove(a[i]);
		}
		else {
			s.add(a[i]);
		}
		return pair;
		
	}
	
	public static void main(String[] args) {
		FindPairs fp= new FindPairs();
		int a[]= {10, 20, 10, 20, 30, 50, 50};
		System.out.println(fp.findP(a));
	}
}
