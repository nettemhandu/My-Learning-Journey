package za.co.simulation;

import java.security.PrivateKey;

public class BirthdayCake extends Cake {
    private int candles;

    public BirthdayCake(String flavor) {
        super(flavor);
        flavor = "chocolate";
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
