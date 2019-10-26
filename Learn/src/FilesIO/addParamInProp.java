package FilesIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class addParamInProp {
	public void getVisitCout(String page) {
		 Properties prop= new Properties();
		 FileInputStream fis;
		 FileOutputStream fos;
		try {
			fis = new FileInputStream("C:\\Users\\summaity.ORADEV\\Documents\\hundred\\visits.txt");
			prop.load(fis);
			fos= new FileOutputStream("C:\\Users\\summaity.ORADEV\\Documents\\hundred\\visits.txt");
			prop.setProperty(page,(Integer.parseInt(prop.getProperty(page))+1)+"");
			prop.store(fos, "");
			String count=prop.getProperty(page);
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
	
	public static void main(String[] args) {
		addParamInProp ap= new addParamInProp();
		ap.getVisitCout("look");
	}
}
