//Question 3
public class Temperature {
	    int convert(int f) {
		return 5/9*(f-32);
		
	}
	public static void main(String[] args) {
		Temperature obj=new Temperature();
		int temp=obj.convert(32);
		System.out.println("Temperature from Fahrenheit degree to celcius is "+temp+" degree celcius");
	}

}
