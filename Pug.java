//method overriding
class Dogg{
	void show(){
		System.out.println("Welcome dog");
	}
}
public class Pug extends Dogg {
	void show(){
		System.out.println("Welcome pug");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pug p=new Pug();
		p.show();

	}

}
