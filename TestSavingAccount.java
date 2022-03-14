//Question 17
class SavingAccount
{
	static double annualInterestRate=0.06;
	private double savingsBalance=5000;
	
	public SavingAccount(double mysavingsBalance,double myannualInterestRate) {
		savingsBalance=mysavingsBalance;
		annualInterestRate=myannualInterestRate;
	}
	public void setannualInterestRate(double c) {
		this.annualInterestRate=c;
	}
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	
	public void setsavingsBalance(double b) {
		this.savingsBalance=b;
	}
	public double getsavingsBalance() {
		return savingsBalance;
	}
	
	public void calculateMonthlyInterest() {
		double a=(savingsBalance*annualInterestRate)/12;
		savingsBalance=savingsBalance+a;
		System.out.println("Saving Balance: "+savingsBalance);
		double newBalance=5000+savingsBalance;
		System.out.println("New Balance: "+newBalance);
	}
	static void modifyInterestRate(double a) {
		annualInterestRate=a;
	}
}
public class TestSavingAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount saver1=new SavingAccount(2000.0,0.04);
		SavingAccount saver2=new SavingAccount(3000,0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		saver1.setannualInterestRate(0.05);
		saver2.setannualInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
	}

}
