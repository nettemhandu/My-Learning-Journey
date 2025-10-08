package za.co.simulation;

public abstract class Account {
    private String name;
    private double balance = 1000;
    final private int accNumber;
    final private String pin = "1234";

    public Account(String name, double balance, int accNumber, String pin) {
        this.name = name;
        this.balance = balance;
        this.accNumber = accNumber;
        this.pin = pin;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getPin() {
        return pin;
    }


    // methods

    public abstract double deposit(double amount);

    public abstract double withdraw(double amount);

    public abstract double checkBalance();
}
