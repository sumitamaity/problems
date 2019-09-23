package Topics;

import java.util.Comparator;

public class ComparatorC {
	
	public static Comparator<ComaratorC> ageCompare= new Comparator<ComaratorC>() {// with comparator we can compare 2 object of any class based on the required instance
		

		@Override
		public int compare(ComaratorC arg0, ComaratorC arg1) {
			// TODO Auto-generated method stub
			int a=arg0.getAge();
			int b=arg1.getAge();
			if(a!=b) {
				return a-b;
			}else
				return arg0.getName().compareTo(arg1.getName());
			}};
		
		public static Comparator<ComaratorC> nameCompare= new Comparator<ComaratorC>() {
			

			@Override
			public int compare(ComaratorC arg0, ComaratorC arg1) {
				// TODO Auto-generated method stub
				//ascending order
				return arg0.getName().compareTo(arg1.getName());
			}};
		
}
