package Topics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExp {

	public void testRegex(String str, String pattern) {
		int i=0;
        
		Pattern p= Pattern.compile(pattern);
		Matcher m= p.matcher(str);
		while(m.find()) {
			i++;
			
		}		
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		RegexExp rg= new RegexExp();
		rg.testRegex( "sumitam is not dissapointed yet sumita syapoituj,", "[a-z]apo[a-z]");
		System.out.println();
	}
}
