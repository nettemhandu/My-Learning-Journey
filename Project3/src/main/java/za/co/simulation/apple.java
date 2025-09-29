package za.co.simulation;

public class apple extends fruit {

    public apple(double calories) {
        super(calories);
    }

    public void removeSeeds(){
        System.out.println("Seeds removed.");
    }

    @Override
    public void makeJuice(){
        System.out.println("Yayyy apple smoothie done.");
    }
}
