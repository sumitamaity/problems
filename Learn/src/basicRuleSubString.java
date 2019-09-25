
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
	      
	
	public static void main(String[] args) {
		String s="for";
		String s1="fforfox";
		
		int res=isSubString(s, s1);
		if(res==-1)
			System.out.println("not substring");
		else
			System.out.println("substring");
	}
}
