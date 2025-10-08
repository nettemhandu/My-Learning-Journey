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
            System.out.println("Select an option:");
            System.out.println("Deposit\n" + "Withdraw\n" + "Check Balance\n" + "Exit");
        }
        System.out.println("Wrong pin, please try again...");
    }
}
