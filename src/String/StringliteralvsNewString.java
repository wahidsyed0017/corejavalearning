package String;

public class StringliteralvsNewString {
public static void main(String[] args) {
	String name = "Siddiq";
	String Surname = "shaik";
//	String object
	String Surname1= new String ("shaik");
//	heap memeory
	System.out.println("name  == Surname" +  (name == Surname));
	System.out.println("name == Surname "  + (Surname == name));
}
}
