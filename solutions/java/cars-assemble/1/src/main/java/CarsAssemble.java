public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double answer = 0;
        
        if (speed >= 1 && speed <= 4) {
            double productionRate = speed * 221;
            answer += productionRate;
        }
        else if (speed >= 5 && speed <= 8) {
            double productionRate = speed * 221; // 1326
            double fairlureRate = productionRate * 0.10; // 132.6
            double result = productionRate - fairlureRate; // 1193.4
            answer += result;
        }
        else if (speed == 9) {
            double productionRate = speed * 221; // 1989
            double fairlureRate = productionRate * 0.20; // 397.8
            double result = productionRate - fairlureRate; // 1591
            answer += result;
        }
        else if (speed == 10) {
            double productionRate = speed * 221; // 2219
            double fairlureRate = productionRate * 0.23; // 508.3
            double result = productionRate - fairlureRate; // 1710.7
            answer += result;
        }
        return answer;
    }

    public int workingItemsPerMinute(int speed) {
        double successRate;

        if (speed >= 1 && speed <= 4) {
            successRate = 1.0;
        } else if (speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else {
            successRate = 0.77;
        }

        double carsPerHour = 221 * speed * successRate;
        return (int) (carsPerHour / 60); 
    }
}

