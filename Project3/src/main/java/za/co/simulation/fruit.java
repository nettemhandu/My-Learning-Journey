package za.co.simulation;

public class fruit {
    private double calories;

    public fruit(double calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Juice has been made...");
    }

    public Double getCalories() {
        return calories;
    }
}
