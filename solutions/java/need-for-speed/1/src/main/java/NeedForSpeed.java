class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int distanceDriven;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public boolean batteryDrained() {
        if (battery < batteryDrain) {
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (battery >= batteryDrain){
            battery -= batteryDrain;
            distanceDriven += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
       this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int numberOfDrives = 100 / car.getBatteryDrain();
        int maxDistance = numberOfDrives * car.getSpeed();

        return maxDistance >= distance;
    }
}
