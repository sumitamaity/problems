//Provided a sum, find the 2 values with minimum difference, that can be summed up to get the sum value 
public class MinDiff {
	public int minDiff(int sum) {
		int min=0;int res=0;
		int i;
		for(i=0; i<=sum; i++) {
			res=sum-i;                    
			int count=res-i;             // valu1 =i value 2=sum-i difference between them is {(sum-i)-i}
			if(min>=count)	
			{
				min=count;
				System.out.println(i+" "+res+" "+Math.abs(min));
				break;
			}
			
		}
		return i;
	}
	
	public void minDiffArray(int sum[]) {
		int min=sum[0];
		for(int i=0; i< sum.length-1; i++) {
			for(int j=i+1; j<sum.length; j++) {
				 if(Math.abs(sum[i]-sum[j])<=min)
				 {
					min=Math.abs(sum[i]-sum[j]);
					
				}
			}
		}
		System.out.println(Math.abs(min));	
	}
	
	public static void main(String[] args) {
		MinDiff md= new MinDiff();
		int a[]= {2, 4, 5, 9,12};
		md.minDiffArray(a);
		//md.minDiff(44);
	}
}
