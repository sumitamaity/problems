package Problems;
/* you have a string pattern(aba) that you have repeated many times(abaabaaba) you are given 
 * length in which you have to find how many times the given character is occuring  */
public class repeatedStr {

	public int numOfRepeatedChar(String pattern, int n) {
		int count=0;
		int factor=0;
		int r=0;
		for(int i=0; i<pattern.length();i++) {   //find out how many times a occurs in the pattern
			if(pattern.charAt(i)=='a') {
				count++;
			}
		}
		
		factor=n/pattern.length();               // find out how many time the pattern got repeated 
		r=n%pattern.length();                    // how many char are left out in the patter to get added
		count= count*factor;                     //find how many times the pattern occurs
		
		for(int i=0; i< r; i++) {
			if(pattern.charAt(i)=='a') {
				count++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		repeatedStr noc= new repeatedStr();
		System.out.println(noc.numOfRepeatedChar("aba", 7));
		
	}
}
