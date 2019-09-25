package JsonFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class FindFile {
	
	public StringBuilder findJasonFile(String path) throws IOException {
	
	File file = new File(path);
	
	
	StringBuilder sb= new StringBuilder();
	//InputStream fis= new FileInputStream(file);
	BufferedReader bis=new BufferedReader(new FileReader(file));
	String Line=null;
	Line=bis.readLine();
	while(Line!=null) {
		sb.append(Line);
		sb.append(System.lineSeparator());
		//System.out.println(sb);
	}
	bis.close();
	return sb;
	}
	
	
	public static void main(String[] args) throws IOException {
		FindFile f= new FindFile();
		StringBuilder sb;
		sb =f.findJasonFile("C:\\Users\\summaity.ORADEV\\Documents\\SM\\replacefile.txt");
		System.out.println(sb.toString());
	}

}

