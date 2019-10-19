
public class practice {
   //program to find the first non repeating character in a string
	public void firstNonRpeatingChar() {
		String s= "smitamascity";	int i;char ch = 0;
		boolean flag=false;
		char[] count=new char[256];
			for(i=0; i<s.length(); i++) {
				count[s.charAt(i)]++;
				}
			
				for(int j=0; j<s.length();j++) {
					if(count[s.charAt(j)]==1) {
						flag=true;
					    ch=s.charAt(j);
						break;
					
					}
						}
						if(flag) {
				System.out.println(ch);
			}
		}
	public void firstNonRpeatingStr() {
	String s= "I java am am I am programmer";
	String [] a= s.split(" ");
	int c;
	boolean visited=false;
	
	int index=0;
	int [] count=new int [a.length];
	for(int i=0; i<a.length; i++) {
		c=1;visited=false;
		for(int j=i+1; j<a.length; j++) {
			if(a[i].equals(a[j])) {
				c++;
				visited=true;
			}
		}
		if(visited) {
			count[i]=c;
			System.out.println("count is "+count[i]);
			System.out.println(a[i]);
		}
		if(!visited) {
			count[i]=c;
			
			if(count[i]==1) {
				System.out.println(a[i]);
				break;
			}
		}
		
		
		
	}
	
	
}
	
	//int c=3;
	public void CallByValue(int c) {
		c=c+10;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		practice name = new practice();
		int a=90;
		String s=String.valueOf(a);
		Integer I = Integer.valueOf(s);
		int b=Integer.parseInt(s);
		
		System.out.println(a+" "+s+" "+I+" "+ b);
		//name.CallByValue(4); 
		//System.out.println(name.c);
			}
}