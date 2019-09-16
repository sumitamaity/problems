
public class isSubstring {
	@SuppressWarnings("unused")
	static boolean issubstring(String str2,  
            String rep1) 
{ 
int M = str2.length(); 
int N = rep1.length(); 

// Check for substring from starting  
// from i'th index of main string 
for (int i = 0; i <= N - M; i++)  
{ 
int j; 

// For current index i,  
// check for pattern match 
for (j = 0; j < M; j++) 
if (rep1.charAt(i + j) != str2.charAt(j)) 
 break; 

if (j == M) // pattern matched 
	System.out.println("substring");
return true; 
} 
System.out.println("cannot be substring");
return false; // not a substring 

} 
public static void main(String[] args) {
	//isSubstring es=new isSubstring();
	boolean a=issubstring("abaaas", "aa");
	System.out.println(a);
}
}
