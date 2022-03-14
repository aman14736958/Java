//Hierarchial Inheritance
class Animal{
	void eat() {System.out.println("Animals");}
}
class Lion extends Animal{
	void roar() {System.out.println("Dogs");}
}
class Cat extends Animal{
	void meow() {System.out.println("Cats");}
}
public class Hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.eat();
		//c.roar();
		c.meow();
	}
}
