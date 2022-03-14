//Question 15
class Employee
{
	private String FirstName;
	private String LastName;
	private double MonthlySalary;
	
	//decleration of constructor
	public Employee(String MyFirstName,String MyLastName,double MyMonthlySalary) {
		FirstName=MyFirstName;
		LastName=MyLastName;
		MonthlySalary=MyMonthlySalary;
	}
	
	public void setFirstName(String n) {this.FirstName=n;}
	public void setLastName(String m) {this.LastName=m;}
	public void setMonthlySalary(double x) {
		if(x<0) {
			this.MonthlySalary=0.0;
		}else {
			this.MonthlySalary=x;
		}
	}
	
	public String getFirstName() {return FirstName;}
	public String getLastName() {return LastName;}
	public double getMonthlySalary() {return MonthlySalary;}
	
	
	
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee("Aman","Upadhyay",10.0);
		obj.setMonthlySalary(50000.0);
		System.out.println("Employee 1:"+obj.getMonthlySalary());
		obj.setMonthlySalary(55000.0);
		System.out.println("Employee 1 10% increased salary:"+obj.getMonthlySalary());
		Employee obj2=new Employee("q","r",11.0);
		obj2.setMonthlySalary(60000.0);
		System.out.println("Employee 2:"+obj2.getMonthlySalary());
		obj2.setMonthlySalary(66000.0);
		System.out.println("Employee 2 10% increased salary:"+obj2.getMonthlySalary());
		//System.out.println(obj.getFirstName());
		//obj.setMonthlySalary(-2);
		//System.out.println(obj.getMonthlySalary());

	}

}
