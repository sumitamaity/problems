package Problems;

public class LeftRotate {

	public void rotate(int a[], int n) {
		for(int i=0; i<n; i++) {
			int j, first;
			first=a[0];
			for(j=0; j< a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=first;
		}
	}
	
	public void rotateRight(int a[], int n) {
		for (int i = 0; i < n; i++) {
			int j;
			int last=a[a.length-1];
			for(j=a.length-1; j>0; j--) {
				a[j]=a[j-1];
			}
			a[j]=last;
		}
	}
	
	public static void main(String[] args) {
		int a[]= {2, 4, 3, 11, 12, 5};
		LeftRotate lr=new LeftRotate();
		//lr.rotate(a, 2);
		lr.rotateRight(a, 2);
		for(int i=0; i<a.length; i++)
		System.out.println(a[i]);
	}
}
