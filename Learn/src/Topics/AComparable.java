package Topics;

public class AComparable implements Comparable<Object>{

	int age;
	String name;
	
	public AComparable(int age, String name) {
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


	@Override
	public int compareTo(Object o) {
		int age1=((AComparable)o).getAge();
		return this.age-age1;
	}


	
	
	
}
