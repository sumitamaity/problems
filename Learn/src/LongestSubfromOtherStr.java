
public class LongestSubfromOtherStr {

	public static void main(String[] args) {
		String str = "somestringfromat";
		String str2= "somestring";
		String [] s;
		int max= 0;
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				s[i]= str.substring(i,j);
			}
				for(int a=0; a<s.length(); a++) {
				if(str2.indexOf(s.charAt(a))!=-1) {
				System.out.println(s);
				if(s.length()>max)
					max=s.length();
			
				}
				}
			}
			System.out.println(s+" "+max);
		}
	}
}
