package Topics;

import java.util.Comparator;

public class ComaratorC{

	int age;
	String name;
	
	public ComaratorC(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "AComparable [age=" + age + ", name=" + name + "]";
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static Comparator<ComaratorC> ageCompare= new Comparator<ComaratorC>() {
	

	@Override
	public int compare(ComaratorC arg0, ComaratorC arg1) {
		// TODO Auto-generated method stub
		int a=arg0.getAge();
		int b=arg1.getAge();
		return a-b;
	}};
	
	public static Comparator<ComaratorC> nameCompare= new Comparator<ComaratorC>() {
		

		@Override
		public int compare(ComaratorC arg0, ComaratorC arg1) {
			// TODO Auto-generated method stub
			//ascending order
			return arg0.getName().compareTo(arg1.getName());
		}};
	
}
