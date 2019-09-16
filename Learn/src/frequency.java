
public class frequency {
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
	
}
}
