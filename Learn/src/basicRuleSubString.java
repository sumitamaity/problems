import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class basicRuleSubString {

	static int isSubString(String s1, String s2) {
		
		
	        int M = s1.length(); 
	        int N = s2.length(); 
	      
	        /* A loop to slide pat[] one by one */
	        for (int i = 0; i <= N - M; i++) { 
	            int j; 
	      
	            /* For current index i, check for 
	            pattern match */
	            for (j = 0; j < M; j++) 
	                if (s2.charAt(i + j) != s1.charAt(j)) 
	                    break; 
	      
	            if (j == M) 
	                return i; 
	        } 
	      
	        return -1; 
	        
	    } 
	      
	static int isSubStringMap(String s1, String s2) {
		 int M = s1.length(); 
	     int N = s2.length(); 
	     int flag=-1;
	     List<Character> mp= new LinkedList<Character>();
	     for(int i=0; i< N; i++) {
	    	mp.add(s2.charAt(i)) ;
	     }
	     
	     for(int j=0; j<M; j++) {
	    	if(! mp.contains(s1.charAt(j))) {
	    		//System.out.println("not subset");
	    	    flag=-1;
	    	}
	    	else {
	    	
	    	    mp.remove(j);
		    	 if(mp.size()>0) {
			    		//System.out.println("is a subset");
			    		flag=1;
			    	} 
	     } 
	    	
	     }
		return flag;
	    
	}
	public static void main(String[] args) {
		String s="for";
		String s1="fforfox";
		isSubStringMap(s,s1);
		
		  int res=isSubString(s, s1); if(res==-1) System.out.println("not substring");
		  else System.out.println("substring");
		 
	}
}
