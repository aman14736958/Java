
public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		//Single Line comment
		/*Multi Line comment*/
		
		//default value null
		String name="Aman";
		//default value '\u0000'
		char c='A';
		//default value 0.0f
		Float f= 6.1f;
		System.out.println(f);
		//double default value 0.0d
		double d=5.345d;
		//default value false
		boolean bool=true;
		System.out.println(bool);
		
		int age=18;
		if(age<16) {
			System.out.println("a");
		}else if(age<17){
			System.out.println("b");
		}else {
			System.out.println("Eighteen");
		}
		
		int a=6;
		System.out.println(++a);
		int g=8;
		System.out.println(g++);
		
		int x=5;
		//left shift
		System.out.println(x<<3);
		//right shift
		System.out.println(x>>2);
		
		
		

	}

}


