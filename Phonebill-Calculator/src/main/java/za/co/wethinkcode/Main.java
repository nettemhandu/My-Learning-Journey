package za.co.wethinkcode;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static double gone_over = 0.25;
    static double taxRate = 0.15;

    public static void main(String[] args) {

        // get what we don't know plan fee & overage minutes
        double plan = getPlan();
        double overageMinutes = getOverageMinutes();
        double tax = calculateTax(plan, taxRate);
        scanner.close();

        System.out.println("Phonebill Statement:");
        System.out.println("Plan: " + plan);
        System.out.println("Overage minutes: " + overageMinutes);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }

    private static double getPlan() {
        System.out.println("Enter base cost of the plan: ");
        double plan = scanner.nextDouble();
        return plan;
    }

    private static double getOverageMinutes() {
        System.out.println("Enter overage minutes: ");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes;
    }

    private static double calculateTax(double plan, double taxRate) {
        double tax = plan * taxRate;
        return tax;
    }

    private static double calculateOverage() {

    }
}