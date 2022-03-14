import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		if(year%4==0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not Leap year");
		}
		
		

	}

}
