
public class numOfSwaps {

	public void findNumOfSwaps(int a[]) {
		int temp=0;
		int counter=0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]> a[j]) {
					counter++;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		System.out.println(counter);
		//System.out.println(a[0]);
		//System.out.println(a[a.length-1]);
		
	}
	
	//maximum number of element that can be summed up for the given amount
	//if minimum is required then the sorting should be in 
	public void maximumnumberOfElement(int a[], int amount) {
		int sum=0;
		int count=0;
		int i=0;
		findNumOfSwaps(a);
		for(i=0; i<a.length; i++) {
			if(a[i]<amount) {
				amount= amount-a[i];
				count++;
			}
		}
	System.out.println(count+" ");
	}
	
	
	public static void main(String[] args) {
		numOfSwaps ns= new numOfSwaps();
		int a[]= {45, 2,30, 33, 67,1};
		//ns.findNumOfSwaps(a);
		ns.maximumnumberOfElement(a, 130);
	}
}
