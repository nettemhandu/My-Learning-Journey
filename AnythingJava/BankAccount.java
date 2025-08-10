package AnythingJava;

public class BankAccount {
    /**
     * This is a java Bank Account class to help me better understand Encapsulation
     * The balance hidden - (Encapsulation is hiding sensitive data from unauthorised users)
     * We use getters and setters to retrieve the private encapsulated data
     */
    private double balance = 0;

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println(account.getBalance());
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}