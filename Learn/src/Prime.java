import java.util.Scanner;

public class Prime {

	public static boolean isPrime(int n) {
		boolean f=true;
		int count=0;
		if(n<=1) {
			return false;
		}
		else {
		for (int i = 2; i<n; i++) {
			if((n%i)==0) {
				count++;
			}
			if(count!=0) {
				f=false;
			break;
			}
		}
		
		return f; 
	}}
	
	public boolean coPrime(int n) {
		  //reverse order
			boolean b=isPrime(n);
			if(b) {
			boolean c=isPrime(n+2);
			if(b && c) {
				System.out.println(n+" "+(n+2));
				return true;
			}
			}
		return false;	
	}
	
	public void minDifference(int num) {
		int l=0;
		int uv=0;
		int lv=0;
		int absDiff;
		int res;
		while(!isPrime(num+l))	{
			l++;
		}
		uv=l;
		
		while(!isPrime(num-l))	{
			l--;
		}
		lv=l;
		
	absDiff=Math.min(uv, lv);
	if(absDiff==uv) {
		res=num+uv;
	}else
	{
		res=num-lv;
	}
	System.out.println(num+" "+uv+" "+lv+" "+absDiff+" "+res); 
	}
	public void pairOfPrimewithMinDiff(int sum) {
		int min=0;int res=0;
		for(int i=2; i<=sum; i++) {
		if(isPrime(i)&&isPrime(sum-i)) {
			res=sum-i;
			int count=res-i;
			if(min>=count) {
				min=count;
			System.out.println(i+" "+res);
			break;
		}}}
	}
		
	
	
	public static void main(String[] args) {
		Prime prime= new Prime();
		System.out.println("enter number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//int n= sc.nextInt();
		//prime.minDifference(n);
		/*
		 * for(int i=n; i>=1; i--) { prime.coPrime(i); }
		 */
		/*
		 * for(int i=100; i<=100+10;i++) { if(isPrime(i)) { System.out.println(i); } }
		 */
		prime.pairOfPrimewithMinDiff(1002);
		
	}
	}
	

