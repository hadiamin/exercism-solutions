import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    private final int[] lastWeekCount = new int[] { 0, 2, 5, 3, 7, 8, 4 };

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return lastWeekCount;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(count -> count == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int countForFirstDays = 0;

        numberOfDays = Math.min(numberOfDays, 7);

        for (int i = 0; i < numberOfDays; i++) {
            countForFirstDays += birdsPerDay[i];
        }
        return countForFirstDays;
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(count -> count > 4).count();
    }
}
