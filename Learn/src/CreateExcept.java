
@SuppressWarnings("serial")
public class CreateExcept extends Exception{
	
	public CreateExcept() {
		// TODO Auto-generated constructor stub
	}
	public CreateExcept(String mesage) {
		
		super(mesage); //this will call getMessage of exception class
		
	}
	

	public static void main(String[] args) {
		
		try {
		System.out.println("just palying ");
		throw new CreateExcept("throwing error");
		}catch (CreateExcept c){
			
			System.out.println(c.getMessage());
		}
	}
	
}
