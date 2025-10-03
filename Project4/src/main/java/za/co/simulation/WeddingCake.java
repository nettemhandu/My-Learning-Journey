package za.co.simulation;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake(String flavor) {
        super(flavor);
        flavor = "Vanilla";
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
