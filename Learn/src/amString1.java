import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class amString1 {

	public void printPattern(String pattern, String line) {
		Pattern p = Pattern.compile(pattern);
		Matcher match = p.matcher(line);
		while(match.find()) {
		for(int i=0; i< match.groupCount(); i++) {
		System.out.println(match.group(i));
		}}
	}
	
	public static void main(String args[]) {
	  amString1 am1= new amString1();
	  
	  Pattern p = Pattern.compile("a(.*)");
	  String a="aaaabaaa";
	  String str="";
		Matcher match;
		
		for(int i=0; i<a.length()-1; i++) {
			for(int j=i+1; j<a.length()-1; j++) {
				match=p.matcher(a.substring(i,j));
				while(match.find()) {
					str= match.group(i);
					for(int k=0; k<str.length()-1; k++) {
						for(int l=k+1; l<str.length()-1; l++) {
						if(str.charAt(k)==str.charAt(l))
							System.out.println(match.group(i));
						else
							System.out.println(match.group(i).replace(str.charAt(l), '_'));//.replace(str.charAt(k), '_'));
					}}
					
			
		
					}
		
		}}
	 
	 
	}
}
