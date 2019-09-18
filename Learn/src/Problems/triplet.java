package Problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class triplet {

	public int findTriplets(int a[], int r) {
		int count=0;int m=0; int n=0;
		int k;
		 for(int i=0; i< a.length; i++){
		        for(int j=i+1; j<a.length; j++){
		        	
		            for(k=j+1; k<a.length; k++){
		            m=a[i]*r;
		            n= a[j]*r;
		            if(a[j]==m && a[k]==n) {
		                count++;
		            }
		        }
		    }
		    }
		 System.out.println(count);
		    return count;
		    }
	
	public void findTriple(List<Integer> li, int r) {
		Map<Integer, Integer> mp1= new HashMap<Integer, Integer>();
		Map<Integer, Integer> mp2= new HashMap<Integer, Integer>();
		
		//int res=0;
		/*
		 if (mp3.ContainsKey(val))
             res += mp3[val];
         if (mp2.ContainsKey(val))
             if (mp3.ContainsKey(val*r))
                 mp3[val*r] += mp2[val];
             else
                 mp3[val*r] = mp2[val];
         if (mp2.ContainsKey(val*r))
             mp2[val*r]++;
         else
             mp2[val*r] = 1;
     }
     return res;
	}*/
	}
public static void main(String[] args) {
	triplet ft= new triplet();
	int[] a= {1 ,3, 9, 9 ,27 ,81};
	ft.findTriplets(a, 3);
}
}