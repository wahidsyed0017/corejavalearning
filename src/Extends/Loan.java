package Extends;

public class Loan {
void calculatedemi () {
	
}
}
class carloan extends Loan {
	void calculatedemi () {
		System.out.println("calculated emi for car loan");
	}
	}
	class Homeloan extends Loan {
		void calculatedemi () {
			System.out.println("caculated emi for home loan");
		}
		}
	class loandetails {
		public static void main(String[] args) {
			carloan car = new carloan () ;
			car.calculatedemi();
			Homeloan home = new Homeloan ();
			home.calculatedemi();
			
				
			
		}
	
}
	

