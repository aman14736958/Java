//Question 8
import java.util.*;
public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		if(a%b==0) {
			System.out.println(a+" is multiple of "+b);
		}else if(b%a==0) {
			System.out.println(b+" is multiple of "+a);
		}else {
			System.out.println("Not a multiple");
		}
	}

}
