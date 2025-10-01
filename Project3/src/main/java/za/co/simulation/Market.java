package za.co.simulation;

public class Market {
    public static void main(String[] args) {
        fruit one = new apple(23);
        one.makeJuice();

        fruit two = new banana(32);
        two.makeJuice();
    }
}