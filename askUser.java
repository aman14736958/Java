//Question 6
import java.util.*;
public class askUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" is large");
		}else if(b>a) {
			System.out.println(b+" is large");
		}else if(a==b) {
			System.out.println("These numbers are equal");
		}
		

	}

}
