
public class StringOperations {
	public static void main(String[] args) {
		String s1="hello";
		String s2=new String("HELLO");
		char ch[]= {'s','t','r'};
		String s3=new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.equals(s2));//returns boolean value
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1==s2);
		//== compare the references.
		//
		String s4="hello";
		System.out.println(s1==s2);
		System.out.println(s1.compareTo(s4));//if true it returns 0 else 1
		System.out.println(s1.length());
		System.out.println(s3.length());
		System.out.println(s1.compareTo(s3));//s1>s3
		System.out.println(s3.compareTo(s1));//s3<s1
		System.out.println(s1.concat(s2));
		System.out.println(String.join(" ", s1,s2));
		
	

}
}
