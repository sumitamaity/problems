package Problems;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class subsetMagagine {
	
	public static void practiceIO() throws IOException {
		BufferedInputStream bis= new BufferedInputStream(new FileInputStream("C:\\Users\\summaity.ORADEV\\Documents\\SM\\LastMin\\seles.txt"));
		BufferedInputStream bis1= new BufferedInputStream(new FileInputStream("C:\\Users\\summaity.ORADEV\\Documents\\SM\\LastMin\\query.txt"));
		BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("C:\\Users\\summaity.ORADEV\\Documents\\SM\\LastMin\\write.txt"));
		SequenceInputStream sis= new SequenceInputStream(bis, bis1);
		int i;
		//System.out.println((char)i);
		while((i=sis.read())!=-1){
			bos.write(i);
		}
		bos.close();
		sis.close();
		bis.close();
		bis1.close();
	}

	public void findSubset(String[] a, String[] b) {
		int count=0;
	
		
		Map<String, Integer> mp= new HashMap<String, Integer>();
		for(String x: a) {
			if(mp.containsKey(x))
			mp.put(x, mp.get(x)+1);
			else
				mp.put(x,1);
		}
		
		System.out.println(mp);
		for(String y: b) {
			if(!mp.containsKey(y)) {
				System.out.println("NO");
			}
		
		count=mp.get(y);
		
		if(count>0) {
			mp.remove(y);
			System.out.println("yes");
		}else
			mp.put(y, mp.get(y));
			//System.out.println("No");
	}
	}
	public boolean findSub(String a[], String[] b) {
		int m=a.length;
		int n=b.length;
		int i=0;
		int j=0;
		for(i=0; i<m; i++) {
			{
				for(j=0; j<n; j++) {
					if(b[i]==a[j]) {
						System.out.println("subset");
						break;}
				}
			
		
		System.out.println("subset");
				
		return true;}}
		return false;
		
		
	}
	
	public static void main(String[] args) {
		subsetMagagine m= new subsetMagagine();
		String[] a=new String[4];
		String[] b= new String[3];
		//m.findSub();
		//@SuppressWarnings("resource")
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter first one");
		for(int i=0; i< a.length; i++) {
			a[i]=sc.next();
		}
		System.out.println("enter second one");
		for(int i=0; i< b.length; i++) {
			b[i]=sc.next();
		}*/
		//m.findSubset(a, b);
		//m.findSub(a, b);
		try {
			practiceIO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}}
