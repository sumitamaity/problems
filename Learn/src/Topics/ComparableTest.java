package Topics;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableTest {
public static void main(String[] args) {
	AComparable ac0= new AComparable(29, "mrnav");
	AComparable ac1= new AComparable(97, "zarun");
	AComparable ac2= new AComparable(20,"aumita");
	
	ArrayList<AComparable> li=new ArrayList<AComparable>();
	li.add(ac0);
	li.add(ac1);
	li.add(ac2);
	
	Collections.sort(li);
	
	for(AComparable a:li) {
		System.out.println(a);
	}
	
	
}
}
