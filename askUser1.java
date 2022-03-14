//Question 7
import java.util.*;
public class askUser1 {
	int sum(int a,int b,int c) {
		return(a+b+c);
	}
	int avg(int a,int b,int c) {
		return((a+b+c)/3);
	}
	int pro(int a,int b,int c) {
		return(a*b*c);
	}
	void smallest(int a,int b,int c) {
		if(a<b && a<c) {
			System.out.println(a);
		}else if(b<a && b<c) {
			System.out.println(b);
		}else{
			System.out.println(c);
		}
	}
	void largest(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a);
		}else if(b>a && b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		askUser1 obj=new askUser1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first numner:");
		int a=sc.nextInt();
		System.out.println("Enter second numner:");
		int b=sc.nextInt();
		System.out.println("Enter third numner:");
		int c=sc.nextInt();
		int d=obj.sum(a,b,c);
		System.out.println("Sum:"+d);
		int e=obj.avg(a,b,c);
		System.out.println("Average:"+e);
		int f=obj.pro(a,b,c);
		System.out.println("Product:"+f);
		System.out.print("Smallest: ");
		obj.smallest(a, b, c);
		System.out.print("Largest: ");
		obj.largest(a, b, c);
		
		
		
		

	}

}
