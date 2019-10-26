package FilesIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createhundredFiles {

	public static void main(String[] args) throws IOException {
		final String location = "C:\\Users\\summaity.ORADEV\\Documents\\hundred\\";
		for(int i=1; i< 101; i++) {
			
			String fileNames=location+i+".txt";
			if(new File(fileNames).createNewFile()) {
				 FileWriter fostream = new FileWriter(fileNames);
                 BufferedWriter out = new BufferedWriter(fostream);
                 out.write("this lines are written to be retreived by lucene. it is part of file search project!! please bare with us till the closure of the project, inconvenience regretted.");
                 out.close(); 
			}
			else {
				System.out.println("unfortunately it didn't work !!!");
			}
		}
	}
	
}
