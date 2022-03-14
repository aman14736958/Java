//Interface 
//It support multiple inheritance(2parent 1 child)
//interface method does not have a body
//Interface class methods body is written in child class.
interface ani
{
	public void sound();
	public void leg();
}
interface wei
{
	public void wieght();
}
class Horse implements ani,wei
{
	public void sound()
	{
		System.out.println("Horse makes whinny");
	}
	public void leg()
	{
		System.out.println("Horse has four legs");
	}
	public void wei()
	{
		System.out.println("Weight of avg horse is 300-1000kg");
	}
}
public class Imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse myHorse=new Horse();
		myHorse.sound();
		myHorse.leg();
		myHorse.wei();

	}

}
