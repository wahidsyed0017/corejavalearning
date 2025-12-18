package String;

public class Markmobilenumber {
public static void main(String[] args) {
	StringBuffer Mobilenum = new StringBuffer("7989721575");
	
	Mobilenum.replace(2,Mobilenum.length()-2 ,"*******");
	System.out.println("masked number :" + Mobilenum.capacity());
}
}
