//Question 10
import java.util.*;
public class Sphere {
	void sphereVolume(double r) {
		double volume=(4*22*r*r*r)/ (7*3);
		System.out.println("Sphere Volume :"+volume);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere obj=new Sphere();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r=sc.nextDouble();
		obj.sphereVolume(r);
		
		

	}

}
