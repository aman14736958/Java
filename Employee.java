import java.util.Scanner;

public class Employee {
	int id=56;
	String name="pp";
	
	void getDetails(int i , String n)
	{
		id=i;
		name=n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int id=21;
		String name="oo";
		Employee e1=new Employee();
		System.out.println(id);
		System.out.println(name);
		System.out.println(e1.id);
		System.out.println(e1.name);
		e1.getDetails(9, "Aman");
		System.out.println(e1.id);
		System.out.println(e1.name);
		Employee e2=new Employee();
		e2.id=sc.nextInt();
		e2.name=sc.next();
		System.out.println(e2.id);
		System.out.println(e2.name);
	}

}
