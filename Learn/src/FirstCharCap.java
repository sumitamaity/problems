
public class FirstCharCap {

	public void GetFirstCap(String str) {
		char a = ' ';
		StringBuffer s= new StringBuffer();
		for(int i=1; i< str.length(); i++) {
			 // If previous character is space and current 
            // character is not space then it shows that 
            // current letter is the starting of the word
			//if(a ==' ' && str.charAt(i)!=' ') {
			if(str.charAt(i-1)==' ' && str.charAt(i)!=' ') {				/*if (ch[i] >= 'a' && ch[i] <= 'z') { 
					  
                    // Convert into Upper-case 
                    ch[i] = (char)(ch[i] - 'a' + 'A'); */
				s.append(Character.toUpperCase(str.charAt(i)));
			}else {
				s.append(str.charAt(i));
			}
			a=str.charAt(i);
			}
		
		System.out.println(s.toString().trim());
		}
	
	public String swapFnL(String str) {
		char[] ch=str.toCharArray();
		for(int i=0; i< ch.length; i++) {
			int k=i;      //store the first letter of word in k
			while(i< ch.length && ch[i]!=' ') {
				i++;     //get the the last letter of the word
			}
			char temp=ch[k];  //swap the letters
			ch[k]=ch[i-1];
			ch[i-1]=temp;
			
		}
		System.out.println(new String(ch));
		return new String(ch);
	}
	public static void main(String[] args) {
		FirstCharCap fc= new FirstCharCap();
		fc.GetFirstCap("my name is sumita");
		fc.swapFnL("My Name Is Sumita");
	}
	}

