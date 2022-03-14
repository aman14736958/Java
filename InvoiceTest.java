class Invoice
{
	private String Name;
	private String Description;
	private int Quantity;
	private double PricePerItem;
	
	//Declare Constructor
	public Invoice(String myName,String myDescription,int myQuantity,double myPricePerItem) 
	{
		Name=myName;
		Description=myDescription;
		Quantity=myQuantity;
		PricePerItem=myPricePerItem;
	}
	

	public void setName(String n) {this.Name=n;}
	public String getName() {return Name;}
	public void setDescription(String m) {this.Description=m;}
	public String getDescription() {return Description;}
	public void setQuantity(int x) 
	{
		if(Quantity>0) {
			this.Quantity=x;
		}else {
			this.Quantity=0;
		}
	}
	

	public int getQuantity() {return Quantity;}
	public void setPricePerItem(Double y) 
	{
		if(PricePerItem>0) {
			this.PricePerItem=y;
		}else {
			this.PricePerItem=0.0;
		}
	}
	public Double getPricePerItem() {return PricePerItem;}
	public double getInvoiceAmount() {return Quantity*PricePerItem;}

}

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice obj=new Invoice("aa","ghjkghj",3,60.2);
		System.out.println(obj.getQuantity());
		System.out.println(obj.getPricePerItem());
		//obj.setQuantity(5);
		//obj.setPricePerItem(25.0);
		System.out.println(obj.getInvoiceAmount());
		

	}

}
