package Problems;

public class MakeAnagram {

	public void makeAnagramFromString(String a, String b) {
		int count=0;  char z = 0;
		for (int i = 0; i < a.length(); i++) {
			if(a.indexOf(b.charAt(i)) < 0) {
				z=b.charAt(i);
				System.out.println(z);
				count++;
			}
		}
		 for (int i = 0; i < b.length(); i++) { 
			 if((b.indexOf(a.charAt(i)) < 0 && (a.charAt(i))!=z)) {
		 count++; 
		 } 
			 }
		 
		System.out.println(count);
	}
	public void makeAnagramFromStringA(String a, String b) {
		int[] count1= new int[26];
		int[] count2= new int[26];
		
		for (int i = 0; i < a.length(); i++) {
			count1[a.charAt(i)-'a']++;
			//System.out.println(count1[a.charAt(i)-'a']++);
		}
		for (int i = 0; i < b.length(); i++) {
			count2[b.charAt(i)-'a']++;
		}
		
		int result=0; 
		for (int i = 0; i < 26; i++) {
			result+= Math.abs(count1[i]-count2[i]);
			System.out.println(result);
		}
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		MakeAnagram ma = new MakeAnagram();
		//ma.makeAnagramFromString("sumita", "maitym");  //should not work as we need frequency of the character to be same in both cases
		ma.makeAnagramFromStringA("sumitam", "maity");              
	}
}
