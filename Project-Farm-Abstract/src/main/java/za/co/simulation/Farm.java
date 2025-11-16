package za.co.simulation;

public class Farm {
    public static void main(String[] args) {
        System.out.println("Welcome to the farm!");
        Pig piggy = new Pig();
        piggy.makeSound();

        Duck duckie = new Duck();
        duckie.makeSound();
        duckie.eat("nettie");
    }
}