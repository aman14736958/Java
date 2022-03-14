import java.util.*;
public class marksRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int marks=sc.nextInt();
		if(marks>=91 && marks<100) {
			System.out.println("A");
		}else if(marks>=81 && marks<91) {
			System.out.println("B");
		}else if(marks>=71 && marks<81) {
			System.out.println("C");
		}else if(marks>=61 && marks<71) {
			System.out.println("D");
		}else if(marks>=51 && marks<61) {
			System.out.println("E");
		}else {
			System.out.println("Reappear");
		}
		}
		

	}


