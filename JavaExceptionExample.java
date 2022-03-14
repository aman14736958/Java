//catch will only execute when try has some error
//if not sure of exception type use(Exception root)
public class JavaExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=10/0;
			int c[]=new int[5];
			c[6]=15;
		}
		catch(ArithmeticException a){
			System.out.println("An arithmetic error occured");
			System.out.println(a);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
