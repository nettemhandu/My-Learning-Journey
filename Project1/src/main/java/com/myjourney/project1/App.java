package Project1.src.main.java.com.myjourney.project1;

import java.awt.*;
import java.util.Scanner;

public class App {
    private static String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        System.out.println("Pick a number from 1 - 7?");
        int userInput = scanner.nextInt();
        String answer = matchTheDay(2);

    }

    public static String matchTheDay(int userInput) {
        switch (userInput) {
            case 1:
                return daysOfTheWeek[0];
                break;
            case 2:
                System.out.println(daysOfTheWeek[1]);
                break;
            case 3:
                System.out.println(daysOfTheWeek[2]);
                break;
            case 4:
                System.out.println(daysOfTheWeek[3]);
                break;
            case 5:
                System.out.println(daysOfTheWeek[4]);
                break;
            case 6:
                System.out.println(daysOfTheWeek[5]);
                break;
            case 7:
                System.out.println(daysOfTheWeek[6]);
                break;
            default:
                System.out.println("Invalid input...");
        }
    return "";
    }
}
