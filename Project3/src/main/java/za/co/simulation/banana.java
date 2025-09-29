package za.co.simulation;

public class banana extends fruit {

    public banana(double calories) {
        super(calories);
    }

    public void peel(){
        System.out.println("Banana has been peeled.");
    }

    @Override
    public void makeJuice(){
        System.out.println("Yayyy banana smoothie done.");
    }
}
