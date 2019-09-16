package Problems;

import java.util.Arrays;

class numofchar { 
	static final int MAX_CHAR = 256; 
	 
	 String removeDuplicate(char str[], int n) 
	    { 
	        // Used as index in the modified string 
	        int index = 0; 
	  
	        // Traverse through all characters 
	        for (int i = 0; i < n; i++) 
	        { 
	  
	            // Check if str[i] is present before it  
	            int j; 
	            for (j = 0; j < i; j++)  
	            { 
	                if (str[i] == str[j]) 
	                { 
	                    break; 
	                } 
	            } 
	  
	            // If not present, then add it to 
	            // result. 
	            if (j == i)  
	            { 
	                str[index++] = str[i]; 
	            } 
	        } 
	        return String.valueOf(Arrays.copyOf(str, index)); 
	    } 
	
	static boolean getOccuringChar(String str) 
	{ 
		// Create an array of size 256 i.e. ASCII_SIZE 
		int count[] = new int[MAX_CHAR]; 
		boolean a=false;
		int len = str.length(); 

		// Initialize count array index 
		for (int i = 0; i < len; i++) 
		count[str.charAt(i)]++; 

		// Create an array of given String size 
		//char ch[] = new char[str.length()]; 
		char ch[]=str.toCharArray();
		for (int i = 0; i < len; i++) { 
			
			int find = 0; 
			for (int j = 0; j <= i; j++) { 

				// If any matches found 
				if (str.charAt(i)==ch[j] ) 
					find++;				 
			} 

			if (find == 1) 
				System.out.println("Number of Occurrence of " + 
				str.charAt(i) + " is:" + count[str.charAt(i)]);	
			
			if(count[str.charAt(i)] %2==0 )
				 a=true;
			else
				a= false;
		}
		return a; 
	} 
	public static void main(String[] args) 
	{ 
		numofchar noc= new numofchar();
		String str = "sumitamaity"; 
		//getOccuringChar(str);
		//boolean a= getOccuringChar(str);
		//System.out.println(a);
		System.out.println(noc.removeDuplicate(str.toCharArray(), 11));
		
	} 
} 
