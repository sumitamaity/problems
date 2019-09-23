package Topics;

import java.util.ArrayList;
import java.util.Collections;

public class comparatorTest {
	public static void main(String[] args) {
		ComaratorC ac0= new ComaratorC(29, "mrnav");
		ComaratorC ac1= new ComaratorC(97, "zarun");
		ComaratorC ac3= new ComaratorC(97, "arun");
		ComaratorC ac2= new ComaratorC(20,"aumita");
		
		ArrayList<ComaratorC> li=new ArrayList<ComaratorC>();
		li.add(ac0);
		li.add(ac1);
		li.add(ac2);
		li.add(ac3);
		Collections.sort(li, ComparatorC.ageCompare);
		
		for(ComaratorC a:li) {
			System.out.println(a);
			
		}
		System.out.println("---------------------------------------");
		Collections.sort(li, ComparatorC.nameCompare);
		
		for(ComaratorC a:li) {
			System.out.println(a);
		}
	}
	
}
