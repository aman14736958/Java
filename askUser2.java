//Question 9
import java.util.*;
public class askUser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 10 elements between 1 to 10:");
		Scanner sc=new Scanner(System.in);
		int arr[];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			System.out.println("Array elements are:");
			System.out.println(arr[i]);
		}
		//int couter=sizeof(arr)/sizeof(arr[0]);
		
		

	}

}
