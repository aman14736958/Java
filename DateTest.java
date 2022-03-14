//Question 16
class Date
{
	private int Month;
	private int Date;
	private int Year;
	//Constructor
	public Date(int MyDate,int MyMonth, int MyYear ) 
	{
		Month=MyMonth;
		Date=MyDate;
		Year=MyYear;
	}
	public void setMonth(int n) {this.Month=n;}
	public void setDate(int m) {this.Date=m;}
	public void setYear(int x) {this.Year=x;}
	public int getMonth() {return Month;}
	public int getDate() {return Date;}
	public int getYear() {return Year;}
	
	public void DisplayDate() {
		System.out.println("Date is:"+Date+"/"+Month+"/"+Year);
	}
	
}
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date obj=new Date(6,3,2022);
		System.out.println(obj.getDate());
		System.out.println(obj.getMonth());
		System.out.println(obj.getYear());
		obj.DisplayDate();
		obj.setYear(2050);
		System.out.println(obj.getYear());

	}

}
