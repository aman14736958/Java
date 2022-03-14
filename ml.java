//Multilevel Inheritance
class C{
	int id=1;
}
class D extends C{
	String name="Aman";
}
public class ml extends D {
	String city="Hyderabad";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ml obj=new ml();
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.city);

	}

}
