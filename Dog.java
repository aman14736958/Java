//1.Abstract Keyboard
//abstract class does not have a body
//abstract class method get implemented in child class
abstract class  ABC
{
	abstract void display();
	void getColor() 
	{
		System.out.println("Non abstract");
	}
}
public class Dog extends ABC{
	void display() 
	{
		System.out.println("Abstract method implementation");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.display();
		d.getColor();
		

	}

}
