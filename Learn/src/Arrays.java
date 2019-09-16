import java.util.Scanner;

public class Arrays {

	
	public void insert(int a[], int val) {
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println("");
			a[i]=val;
			System.out.println(a[i]);
			val++;
		}
	}
	
	public void insertAtPosition(int a[], int pos, int val) {
		
		a[pos]=val;
		System.out.println(a);
	for(int i=pos; i<a.length; i++) {
		System.out.println(a[i]);
		a[i]= a[i-1];
		
		
	}
	for(int i=0; i<a.length-1;i++)
	System.out.println(a[i]);
	}
	
	public void deleteFposition(int a[], int ele) {
		int pos=0;
		int len=a.length;
		for(int i=0; i< a.length;i++) {
			if(a[i]==ele) {
			pos=i;
			break;
			}
		}
		
		for(int j=pos; j<a.length-1; j++) {
			a[j]=a[j+1];
			System.out.println(a[j]);
		}
	len--;
	}
	

	
	public static void main (String args[]) {
		int z[] = new int[4];
		Arrays a= new Arrays();
		a.insert(z, 0);
		System.out.println(z[2]);
		a.insertAtPosition(z, 1, 23);
		a.deleteFposition(z, 23);
		
	}
}
