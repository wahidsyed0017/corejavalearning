package Inhertiance;

public class Sbi {

	void balance() {
		System.out.println("Bank balance in sbi bank");
	}

	void amount() {
		long a = 50454l;
		System.out.println(a);
	}

	public static void main(String[] args) {

		Sbi obj = new Sbi();
		obj.balance();
		obj.amount();
	}

}
