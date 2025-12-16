package Encapsulation;

class BankAcc {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class Bankaccountbalance {

	public static void main(String[] args) {
		BankAcc balance = new BankAcc();
		balance.setBalance(5000);
		System.out.println(balance.getBalance());
	}
}
