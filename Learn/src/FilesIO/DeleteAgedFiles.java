package FilesIO;

import java.io.File;

public class DeleteAgedFiles {
 static String DirPath = "C:\\Users\\summaity.ORADEV\\Documents\\hundred\\";
 
 public void deleteFiles(int days) {
	int count=0;
	 File directory= new File(DirPath);
	 long purgeTime= System.currentTimeMillis()-(days*1*60*60*1000);
	 System.out.println(System.currentTimeMillis());
	 System.out.println(purgeTime);
		 if(directory.isDirectory()) {
		 File[] files= directory.listFiles();
		 for(int i=0; i<files.length; i++) {
			 if(files[i].lastModified()< purgeTime) {
				 if(files[i].delete())
					 
					count++;
				 else
					 System.out.println("cannot delete files , they might have been already deleted!");
			 }
		 }
		 System.out.println("files deleted successfully!!"+ count);
	 }
	 
 }
 
 public static void main(String[] args) {
	DeleteAgedFiles name = new DeleteAgedFiles();
	name.deleteFiles(2);
}
 
}
