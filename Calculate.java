//Question 2
public class Calculate {
	int result(int a,int b,int c) {
		return a*b*c;
	}
	public static void main(String[] args) {
		Calculate obj=new Calculate();
		int a=obj.result(2, 3, 4);
		System.out.println(a);
	}

}
