package FilesIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class ChangeFileContent {
	static Properties prop = new Properties();
	public static void main(String args[]) throws Exception {
		String propPath = "C:\\Users\\summaity.ORADEV\\Documents\\hundred";
		
		//String propFiles="1.text";
		String[] li = {"7.txt", "8.txt", "9.txt", "10.txt", "11.txt"};
		List<String> list = new ArrayList<String>();
		for(int i = 0;i<li.length;i++){
			list.add(li[i].toLowerCase());
		}
		
		for (File eachfile : new File(propPath).listFiles()) {
			if(list.contains(eachfile.getName().toLowerCase()))
	    	{
        		System.out.println(eachfile.getName());
	    		changeContenttxt(eachfile.getPath());
	    	}
		}
		
		System.out.println("Ended");
		
	}
	
	public static void findFile(String name,File file) throws IOException, FileNotFoundException
    {
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
        {
            if (fil.isDirectory())
            {
               
            	findFile(name,fil);
            }
            else if (name.equalsIgnoreCase(fil.getName()))
            {
            	if(fil.getParentFile().getName().startsWith("hundred"))
            	{
            		
            		changeFileContent(fil.getPath());
            	}
            }
        }
        //System.out.println("Co output "+pathToGive);
    }
	
	public static void changeFileContent(String filepath) throws IOException, FileNotFoundException
    {
		prop.load(new FileInputStream(new File("somepath")));
		
		File currFile = new File(filepath);
		File currFile1 = new File(filepath.replaceFirst("script.java", "script_tmp.java"));
		
		try{
		BufferedReader br = new BufferedReader(new FileReader(currFile)); 
		BufferedWriter bw = new BufferedWriter(new FileWriter(currFile1));
		
		
		  String st; 
		  while ((st = br.readLine()) != null) 
		    {
			  //System.out.println(st);
			  for (Object keystr : prop.keySet()) {
				
				  if(st.contains((String)keystr))
					  {
					  st = st.replaceAll((String) keystr, prop.getProperty((String) keystr));
					  
					  System.out.println("replaced "+keystr+" with "+prop.getProperty((String) keystr)+"in the file "+filepath);
					  }
			  	}
			  bw.write(st+"\n");
			  
		    }
		 
	        
	      bw.close();
		  br.close();
		  
		  //FileUtils.copyFile(currFile1, currFile);
		  
		  if(currFile.exists())
				currFile.delete();
			currFile1.renameTo(currFile);
		}catch (Exception e) {
			System.out.println("Unable to modify the file "+filepath);
		}
    }
	public static void changeContenttxt(String filepath) throws IOException, FileNotFoundException
    {
		prop.load(new FileInputStream(new File("C:\\Users\\summaity.ORADEV\\Documents\\hundred\\1.txt")));
		
		File currFile = new File(filepath);
		File currFile1 = new File(filepath.replaceFirst(".txt", "_tmp.txt"));
		
		try{
		BufferedReader br = new BufferedReader(new FileReader(currFile)); 
		BufferedWriter bw = new BufferedWriter(new FileWriter(currFile1));
		
		
		  String st; 
		  while ((st = br.readLine()) != null) 
		    {
			 
			  for (Object keystr : prop.keySet()) {
				
				  if(st.contains((String)keystr))
				  {
					  st = st.replaceAll((String) keystr, prop.getProperty((String) keystr));
					  
					  System.out.println("replaced "+keystr+" with "+prop.getProperty((String) keystr)+"in the file "+filepath);
				  }
				 
			  	} 
			  bw.write(st+"\n");
			  
		    }
		  bw.close();
		  br.close();
		  
		  
		}
		catch(Exception e){
			System.out.println("Unable to modify the file "+filepath);
		} 
		
		if(currFile.exists())
			currFile.delete();
		currFile1.renameTo(currFile);
    }
	
	
	public void finish() throws Exception {
	}
}


