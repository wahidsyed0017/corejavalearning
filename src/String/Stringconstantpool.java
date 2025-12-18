package String;

public class Stringconstantpool {

public static void main(String[] args) {
	String s1 = "Hotel";
	String s2 = "Hotel";
	if (s1==s2) {
		System.out.println("saved in constant memory");
	}else {
		System.out.println("saved in heap memory");
	}
	System.out.println(s1 ==s2);
	
}
}
