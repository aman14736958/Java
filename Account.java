//Question 13
import java.util.*;
public class Account {
	int AccBal=50000;
	void debit(int a) {
		if(a>50000) {
			System.out.println("Debit amount exceeded account balance.");
		}else {
			System.out.println("Available balance in account is:"+AccBal);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance you want to withdraw:");
		int a=sc.nextInt();	
		obj.debit(a);
		

	}

}
