
public class MissingLetter {

	public void FindMissing(String input){
		input=input.toLowerCase();
		for(char ch='a'; ch<='z' ;ch++) {
		boolean	flag=false;
			for(int i=0; i<input.length(); i++) {
				if(input.charAt(i)==ch) {
					System.out.println("found " +ch);
					flag=true;
					}
				}
				
				if(false==flag) {
					System.out.println("missing char is "+ch);
				
				}}
			}
			
	public static void main(String[] args) {
		MissingLetter ml= new MissingLetter();
		ml.FindMissing("anamikadas");
	}
}
