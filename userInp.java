//Question 5
import java.util.*;
public class userInp {
	int calc(int a,int b) 
	{
		return(a+b);
	}
	int calc1(int a,int b) 
	{
		return(a-b);
	}
	int calc2(int a,int b) 
	{
		return(a*b);
	}
	int calc3(int a,int b) 
	{
		return(a/b);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number:");
		int x=sc.nextInt();
		System.out.println("Enter second number:");
		int y=sc.nextInt();
		userInp obj=new userInp();
		int z=obj.calc(x,y);
		int z1=obj.calc1(x,y);
		int z2=obj.calc2(x,y);
		int z3=obj.calc3(x,y);
		System.out.println("Addition:"+z);
		System.out.println("Subtraction:"+z1);
		System.out.println("Multiplication:"+z2);
		System.out.println("Quotient:"+z3);
	}

}
