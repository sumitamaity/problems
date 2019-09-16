
public class Nest {

	static int num=24;
	
	
	public static class StClass{
		public void name(String s) {
			System.out.println(s);
		}
	}
	
	public class inner{
		public void age(int a) {
			System.out.println(a);
			
		}
		
	}
	
	public  void display() {                //local class
		inner in = new inner();
		in.age(6);
		class local{
			public local() {
			System.out.println("this is local class constructor");	
			}
			private void show() {
				System.out.println("this is local inner class");	
				}
			
			
		}
		local l= new local();
		l.show();
		
	}
	
	public static void show() {
		System.out.println("print static member");
	}
	
	
	public static void main(String[] args) {
		
		
		annonym a= new annonym() {
			@Override
			public void anno() {
				System.out.println("am the annonymous one");
			}
		};                     //remember the syntax
		a.anno();
		/*class local{
			public void getName() {
				System.out.println("am from local");
				inner in= new inner();
			}*/
			
			Nest n=new Nest();
			
			n.display();
			Nest.inner ni= n.new inner();
			
	
			
		    Nest.StClass ns= new Nest.StClass();
			
		}
	}

