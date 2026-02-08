public class JedliksToyCar {
    public int distance = 0;
    public int battery = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery <= 0){
            return "Battery empty";
        }
        else {
            return "Battery at " + battery + "%";
        }
    }

    public void drive() {
        if (battery <= 0) {
            battery += 0;
        } 
        battery -= 1;

        if (distance >= 2000) {
            distance += 0;
        }
        else if (distance <= 1980) {
            distance += 20;
        }
    }
}


