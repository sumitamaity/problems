package FilesIO;
import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
public class ReadFileIntoList 
{  
  public List<String> readFileInList(String fileName) 
  { 
  
    List<String> lines = Collections.emptyList(); 
    try
    { 
      lines = 
       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
      System.out.println(lines.toString());
    } 
    catch (IOException e) 
    { 
      //e.printStackTrace(); 
    } 
    return lines; 
  } 
  
  public static void main(String[] args) {
	ReadFileIntoList ril=new ReadFileIntoList();
	ril.readFileInList("C:\\Users\\summaity.ORADEV\\Downloads\\alta.java");
}
} 