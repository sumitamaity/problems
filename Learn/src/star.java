import java.util.Scanner;

public class star {

	public void makeOnsided() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number of lines ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
	}
	public void makeOnsidedOpposit() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number of lines ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		  {
		   for(int j=1;j<=n;j++)
		    
		   {
		    if((i+j)>n)
		    {
		    System.out.print("#");
		    }
		    else
		    {
		     System.out.print(" ");
		    }
		    
		   }
		   System.out.println();
		   
		  }
	}
	
	public static void main(String[] args) {
		star s= new star();
		s.makeOnsided();
		s.makeOnsidedOpposit();
	}
}
