package za.co.simulation;

public class Account {
    private String name;
    private double balance;
    private int accNumber;
    private String pin;

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

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    // methods

}
