import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {

	public String readF(String path)  {
		
		
		StringBuilder b= new StringBuilder();
		BufferedReader bis=null;
		
		try {
			String s=null;
			bis= new BufferedReader(new InputStreamReader(new FileInputStream(path)));
			
	         //bis=new BufferedReader(new FileReader(path)
			//s=bis.readLine(); // cannot be done 
		
		while((s=bis.readLine())!=null) {   // cannot be in a form of s!=null
			b.append(s);
			b.append(System.lineSeparator());
					}
		}
		catch (IOException e) {
						e.printStackTrace();
					} finally {
			if(bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return b.toString();
	}
	
	public String ReplaceText(String s) {
		//String m=null;
		//while(s!=null) make the test case fail
	String	m=s.replace("//", "--"); //works
		return m;
	}
	
	public void writeF(String path, String s) {
		try {
			@SuppressWarnings("resource")
			FileWriter fw= new FileWriter(path);
			fw.write(s);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean findFileInFolder(String path) {
		boolean b=false;
		File file = new File(path);
		if(file.isDirectory()) {
			File a[]= file.listFiles();
			for(int i=0; i<a.length; i++) {
				if(a[i].getName().contains(".txt")) {
					System.out.println(a[i]);
					path=a[i].getAbsolutePath();
					b= true;
					
				}
				else 
					b=false;
			}
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		FileRead fr= new FileRead();
		fr.findFileInFolder("C:\\Users\\summaity.ORADEV\\Documents\\SM");
		String r=null;
		String path= "C:\\Users\\summaity.ORADEV\\Documents\\SM";
		File file = new File(path);
		if(file.isDirectory()) {
			File a[]= file.listFiles();
			for(int i=0; i<a.length; i++) {
				if(a[i].getName().contains(".txt")) {
					System.out.println(a[i]);
					path=a[i].getAbsolutePath();
		String s= fr.readF(path);
		System.out.println(s);
		r=fr.ReplaceText(s);
		fr.writeF(path, r);
		System.out.println(fr.readF(path));
	}
}}}}
