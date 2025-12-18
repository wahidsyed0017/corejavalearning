package String;

public class Deletelastdigit {
public static void main(String[] args) {
	StringBuilder otp = new StringBuilder("345");
	otp.deleteCharAt(2);
	System.out.println("Updated otp : " + otp);
}
}
