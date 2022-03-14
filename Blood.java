import java.util.*;
public class Blood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter weight");
		int weight=sc.nextInt();
		if(age>=30 && weight>=50) {
			System.out.println("Eligible for blood donation");
		}else {
			System.out.println("Not Eligible for blood donation");
		}

	}

}
