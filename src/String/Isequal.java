package String;

public class Isequal {
public static void main(String[] args) {
//	String constant
	String s1 = "wahid";
	String s2 = "wahid";
	String s3 = "java";
	
//	heap memory  (new)
	String s4 = new String ("syed");
	String s5 = new String ("syed");
	String s6 = new String ("java");
	
	System.out.println(s1 == s3);
	System.out.println(s4 == s5);
	
	System.out.println(s1.equals (s6));
}
	
}
