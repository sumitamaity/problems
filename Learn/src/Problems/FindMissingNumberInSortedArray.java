package Problems;

public class FindMissingNumberInSortedArray {

	public void FindMissing(int a[], int N)
	{
		int s=0;

		for(int i=1; i<a.length; i++) {
	
				if((a[i])!=a[i-1]+1) {
					s=a[i-1]+1;
					break;
				}
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		FindMissingNumberInSortedArray fmi= new FindMissingNumberInSortedArray();
		int a[]= {0,1,2,3,4,5,6,7,8,9,10,12};
		int N=a.length;
		fmi.FindMissing(a, N);
	}
}
