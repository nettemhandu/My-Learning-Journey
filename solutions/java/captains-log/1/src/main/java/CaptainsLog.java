import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int num = PLANET_CLASSES.length;
        int index = random.nextInt(num);
        return PLANET_CLASSES[index];
    }

    String randomShipRegistryNumber() {
        int num = random.nextInt(1000, 9999 + 1);
        return "NCC-" + num;
    }

    double randomStardate() {
        double num = random.nextDouble(41000.0, 42000.0);
        return num;
    }
}
