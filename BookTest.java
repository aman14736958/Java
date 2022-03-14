//Question 18
class Book
{
	public String BookName;
	public int ISBN;
	public String AuthorName;
	public String Publisher;
	
	//Constructor Initialization
	public Book(String MyBookName,int MyISBN,String MyAuthorName,String MyPublisher) 
	{
		BookName=MyBookName;
		ISBN=MyISBN;
		AuthorName=MyAuthorName;
		Publisher=MyPublisher;
	}
	public void setBookName(String n) {this.BookName=n;}
	public void setISBN(int m) {this.ISBN=m;}
	public void setAuthorName(String x) {this.AuthorName=x;}
	public void setPublisher(String y) {this.Publisher=y;}
	public String getBookName() {return BookName;}
	public int getISBN() {return ISBN;}
	public String getAuhtorName() {return AuthorName;}
	public String getPublisher() {return Publisher;}
	
	public String getBookInfo() {
		System.out.println("BookName:"+BookName+", "+"ISBN:"+ISBN+", "+"AuthorName:"+AuthorName+", "+"Punlisher"+Publisher);
		return null;
	}
}
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj=new Book("Science",4251,"Aggarwal","BSC");
		obj.getBookInfo();
		System.out.println(obj.getBookName());
		System.out.println(obj.getISBN());
		

	}

}
