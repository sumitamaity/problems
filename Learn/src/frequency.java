
public class frequency {
	
	public static void anno1(String str) {
		
		int g=0;
		int min=0;
		char count[]= new char[256];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;   //for char array we can use count[str.charAt(i)]++;
			/*
			 * g=count[str.charAt(i)]; System.out.println(g);
			 */
			min=count[str.charAt(0)];
			if(count[str.charAt(i)]<=min) {
				min=count[str.charAt(i)];
				g=i;
	
		}
		}
		System.out.println(min+" "+str.charAt(g));
	}
 public static void main(String[] args) {
	char[] a= {'a','o','m','o','j','o','d','k','j'};
	int max=0; int pos=0;
	int[] fr=new int[a.length];
	boolean visited=false;
	for (int i = 0; i < a.length; i++) {
		int count=1;
		for(int j=i+1; j<a.length; j++) {
			if(a[i]==a[j]) {
				count++;
				fr[j]=-1;  // to avoid visiting the same element again
				//visited=true;
			}
		}
		if(fr[i]!=-1) {
	
			fr[i]=count;
			System.out.println(fr[i]+" frequency");
		}
		if(fr[i]>max) {
			max=fr[i];
			pos=i;
		}
		
	}
	
	
		System.out.println(max+"      "+a[pos]);
	
	for(int i=0; i<a.length;i++) {
		if(fr[i]!=-1)
		
		System.out.println(a[i]+"      "+fr[i]);
			
	}
	//anno1("shsumitaumaity");
}
 
}
