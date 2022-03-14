import java.util.*;
//Key and value pair
//it cannot have same value but it can have same key.
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put(1, "Sunday");
		map.put("second", new Integer(2));
		map.put(2,"Monday");
		map.put("third", "III");
		////map.put("third", 3);
		//return set view of keys
		Set set1=map.keySet();
		//return set view of values
		Collection collection=map.values();
		//return the key value pairs
		Set set2=map.entrySet();
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(collection);
		
		
		
	}

}
