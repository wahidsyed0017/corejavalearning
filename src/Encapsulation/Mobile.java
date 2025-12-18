package Encapsulation;


public class Mobile {
	int pin ;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		if (pin>=1000  && pin <=999) {
		this.pin = pin;
		System.out.println("pin set");
	}else {
		System.out.println("invalid pin");
	}
		
	}
	public static void main(String[] args) {
		Mobile mobile = new Mobile ();
		mobile.pin=123;
		
	}
	

}
