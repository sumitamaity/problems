
public class frequency {
	
	public static void anno1(String str) {
		
		int g=0;
		int min=0;
		char count[]= new char[256];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
			g=count[str.charAt(i)];
			//System.out.println(g);
		}
		for(int i=0; i<str.length();i++) {
			min=count[str.charAt(0)];
			if(count[str.charAt(i)]<=min) {
				min=count[str.charAt(i)];
				System.out.println(str.charAt(i));
		break;
	}
		}
	}
 public static void main(String[] args) {
	char[] a= {'a','o','m','o','j','o','d','k','j'};
	int max=0; int pos=0;
	int[] fr=new int[a.length];
	
	for (int i = 0; i < a.length; i++) {
		int count=1;
		for(int j=i+1; j<a.length; j++) {
			if(a[i]==a[j]) {
				count++;
				fr[j]=-1;  // to avoid visiting the same element again
			}
		}
		if(fr[i]!=-1) {
			fr[i]=count;
			
		}
		if(count>max) {
			max=count;
			pos=i;
		}
		
	}
	
	
		System.out.println(max+"      "+a[pos]);
	
	for(int i=0; i<a.length;i++) {
		if(fr[i]!=-1)
			
		System.out.println(a[i]+"      "+fr[i]);
		
	}
	anno1("sumitamaity");
}
 
}
