package Problems;

import java.util.Random;

public class randFuntion {

	public int getRandomNum(int min, int max) {
		return (int) ((Math.random() * ( max - min )) + min);
	}
	
	public int getRandomNumofnDigit(int x) {
		int n=(int) Math.pow(10, x-1);
		return n + new Random().nextInt(9*n);
	}
	
	public int getRandomNumClass() 
	{
		Random rn= new Random();
		int f=rn.nextInt(4);
		System.out.println(f);
		return f;
	}
	
	public static void main(String[] args) {
		randFuntion rf= new randFuntion();
		int a=rf.getRandomNum(2,7); System.out.println(a);
		rf.getRandomNumClass();
	    int s= rf.getRandomNumofnDigit(5);
	    System.out.println(s);
	}
}
