public class CarsAssemble {
    int numberOfCars = 221;
    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
            return numberOfCars * speed;
        } else if (speed >= 5 && speed <= 8) {
            return numberOfCars * speed * 0.9;
        } else if (speed == 9) {
            return numberOfCars * speed * 0.8;
        } else {
            return numberOfCars * speed * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
