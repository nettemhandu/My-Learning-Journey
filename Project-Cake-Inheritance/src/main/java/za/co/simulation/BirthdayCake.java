package za.co.simulation;

import java.security.PrivateKey;

public class BirthdayCake extends Cake {
    private int candles;

    public BirthdayCake(String flavor, int price, int candles) {
        super(flavor, price);
        this.candles = candles;
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
