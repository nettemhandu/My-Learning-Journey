package za.co.simulation;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your Bank Account");
        System.out.println("Enter your name: ");

        String name = scan.nextLine();
        System.out.println("Enter your pin: ");

        String pin = scan.nextLine();

        while (pin.equals("1234")) {
            System.out.println("How may we help you, select an option:");
            System.out.println("Deposit\n" + "Withdraw\n" + "Check Balance\n" + "Exit");

            String option = scan.nextLine();
            switch (option) {
                case "Deposit":
                    return depositMoney();
                case "Withdraw":
                    return withdrawMoney();
                case "Check":
                    return checkBalance();
                default:
                    break;
            }
        }
        System.out.println("Wrong pin, please try again...");
    }

    private static double depositMoney(double amount, double balance) {
        if (amount <= 0){
            System.out.println("You can't deposit a negative number.");
        } else {
            balance += amount;
        }
    }
}
