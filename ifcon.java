import java.util.Scanner;

public class ifcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name:");
		//String name=System.console().readLine();
		String name=sc.nextLine();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		//if(age>=18)?System.out.println("eligible"):System.out.println("not eligible");
		//String s1=(age>=18)?"eligible":"notEligible";
		if(age>=18) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not Eligible");
		}
		
		

	}

}
