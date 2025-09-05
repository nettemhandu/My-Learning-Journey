package za.co.wethinkcode.phonebill;
import java.util.Scanner;

public class Main {
    // Class-level variable: global to this class
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Local variables: exist only in main()
        double costPerMinute = 0.25;
        double taxRate = 0.15;

        // Calls methods and passes local variables
        double plan = getPlan();
        double overageMinutes = calculateOverage(getOverageMinutes(), costPerMinute);
        double tax = calculateTax(plan, taxRate);
        double total = calculateTotal(tax, plan, overageMinutes);

        scanner.close();

        System.out.println("Phonebill Statement:");
        System.out.println("Plan: $" + String.format("%.2f", plan));
        System.out.println("Overage minutes: $" + String.format("%.2f", overageMinutes));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));


    }
    // Method-level scope: 'plan' exists only in this method
    private static double getPlan() {
        System.out.println("Enter base cost of the plan: ");
        return scanner.nextDouble();
    }

    private static double getOverageMinutes() {
        System.out.println("Enter overage minutes: ");
        return scanner.nextDouble();
    }

    private static double calculateTax(double plan, double taxRate) {
        return plan * taxRate;
    }

    private static double calculateOverage(double overageMinutes, double costPerMinute ) {
        return overageMinutes * costPerMinute;
    }

    private static double calculateTotal(double tax, double plan, double overageMinutes) {
        return tax + plan + overageMinutes;
    }
}