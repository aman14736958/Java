//method overloading

public class child {
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c =new child();
		int d=c.add(5,2);
		System.out.println(d);
		int e=c.add(5,2,3);
		System.out.println(e);

	}

}
