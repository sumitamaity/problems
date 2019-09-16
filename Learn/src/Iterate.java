import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Iterate {
public void tryIterate() {
 List<String> al= new ArrayList<String>();
 Scanner sc= new Scanner(System.in);{
	
	 System.out.println();
 
	 for(int i=0; i<=5; i++) {
		 al.add(sc.next());
	 }
  Iterator it= al.iterator();
  while(it.hasNext()) {
	  //System.out.println(al.get(3));
	  System.out.println(it.next());
  }
}
}

public static void main(String[] args) {
	Iterate it= new Iterate();
	it.tryIterate();
}

}
