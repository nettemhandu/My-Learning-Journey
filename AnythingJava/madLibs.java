package AnythingJava;

import java.util.Scanner;

public class madLibs {

    /**
     * This is an interactive madLibs game in java
     * To practice taking user input (using scanner)
     */
    public static void main(String[] args) {

        // ask the user for a season
        System.out.println("Enter the a season: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        // a whole number
        System.out.println("Enter a whole number: ");
        int whole_num = scanner.nextInt();
        scanner.nextLine();

        // an adjective
        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();

        // print result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + whole_num + " cups of coffee.");
    }
}
