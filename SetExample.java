import java.util.*;
//duplicate will not be added
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		//set.add("second");
		System.out.println(set);
		

	}

}
