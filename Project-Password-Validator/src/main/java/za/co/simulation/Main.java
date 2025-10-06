package za.co.simulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
    }

    public void validate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Password: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if character
    }
}
}