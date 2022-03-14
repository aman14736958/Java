//1.Abstract Keyboard
//abstract class does not have a body
//abstract class method get implemented in child class
abstract class  DEF
{
	abstract void display();
	void getColor() 
	{
		System.out.println("Non abstract");
	}
}
public class Elephant extends DEF{
	void display() 
	{
		System.out.println("Abstract method implementation");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant d=new Elephant();
		d.display();
		d.getColor();
		

	}

}
