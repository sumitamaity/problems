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

import org.apache.commons.io.FileUtils;

public class ChangeFileContent {
	static Properties prop = new Properties();
	public void run() throws Exception {


		//String childsPath = "Z:\\racheeka_R13Silver\\faat\\fusionapps\\hcm\\oats\\src\\assets";
		String propPath = "Z:\\summaity_cd\\faat\\fusionapps\\hcm\\oats\\src\\objlib";
		/*System.out.println("Started");
		findFile("script.java", new File(childsPath));
		*/
		String propFiles="";
		String[] li = {"PAY_Define Person Costing_Child.properties","PAY_Define PPM_Child.properties","PAY_DSS Create DIR Card_Child.properties","PAY_Edit Element Entry_Child.properties","PAY_Manage Ded Card-TRU Assn_Child.properties","Pay_ManageBalanceExceptions_Child.properties"};
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
            	if(fil.getParentFile().getName().startsWith("PAY_") || fil.getParentFile().getName().startsWith("Pay_"))
            	{
            		
            		/*String pathToGive=fil.getPath().substring(fil.getPath().indexOf("faat\\")+5, fil.getPath().lastIndexOf("\\"));
            		System.out.println(pathToGive+" ");
            		*/
            		changeContent(fil.getPath());
            	}
            }
        }
        //System.out.println("Co output "+pathToGive);
    }
	
	public static void changeContent(String filepath) throws IOException, FileNotFoundException
    {
		prop.load(new FileInputStream(new File("F:\\HCM\\hpatha\\java utils\\code for changing child and properties content\\keyproperties.properties")));
		
		File currFile = new File(filepath);
		File currFile1 = new File(filepath.replaceFirst("script.java", "script_tmp.java"));
		//File currFile1 = new File("D:\\Test\\childs\\PAY_test\\test_temp.java");
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
					  //bw.write(st+"\n");
					  System.out.println("replaced "+keystr+" with "+prop.getProperty((String) keystr)+"in the file "+filepath);
					  }
				  /*else
					  bw.write(st+"\n");*/
			  	}
			  bw.write(st+"\n");
			  
		    }
		 
	        
	      bw.close();
		  br.close();
		  
		  FileUtils.copyFile(currFile1, currFile);
			if(currFile1.exists())
				currFile1.delete();
		}catch (Exception e) {
			System.out.println("Unable to modify the file "+filepath);
		}
    }
	public static void changeContenttxt(String filepath) throws IOException, FileNotFoundException
    {
		prop.load(new FileInputStream(new File("F:\\HCM\\hpatha\\java utils\\code for changing child and properties content\\keyproperties.properties")));
		
		File currFile = new File(filepath);
		File currFile1 = new File(filepath.replaceFirst(".properties", "_tmp.properties"));
		//File currFile1 = new File("D:\\Test\\props\\test_temp.txt");
		
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
					  //bw.write(st+"\n");
					  System.out.println("replaced "+keystr+" with "+prop.getProperty((String) keystr)+"in the file "+filepath);
				  }
				  /*else
					  bw.write(st+"\n"); */
			  	} 
			  bw.write(st+"\n");
			  
		    }
		 
	        
	      bw.close();
		  br.close();
		  FileUtils.copyFile(currFile1, currFile);
		}
		catch(Exception e){
			System.out.println("Unable to modify the file "+filepath);
		} 
		if(currFile1.exists())
			currFile1.delete();
		
    }
	
	
	public void finish() throws Exception {
	}
}

}
