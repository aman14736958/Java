class Fruit{
	String taste="Sweet";
}
public class Apple extends  Fruit {
	String color="Red";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple obj=new Apple();
		System.out.println(obj.taste);
		System.out.println(obj.color);

	}

}
