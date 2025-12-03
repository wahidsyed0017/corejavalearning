package variables;

public class Bank {

 

    int balance;

    public void deposit(int amount) {
        balance = balance + amount;
    }
    public int getBalance() {
        return balance;
    }
    public static void main(String[] args) {

        Bank acc = new Bank();
        acc.deposit(2200);
        int bal = acc.getBalance();
        System.out.println("Balance : " + bal);
    }
}