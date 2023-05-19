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
        int todayIndex = birdsPerDay.length - 1;
        return birdsPerDay[todayIndex];
    }

    public void incrementTodaysCount() {
        int todayIndex = birdsPerDay.length - 1;
        birdsPerDay[todayIndex] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) return true;
        }
        return false;
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
        int count = 0;
        for (int bird : birdsPerDay) {
            count = bird > 4 ? count + 1 : count;
        }
        return count;
    }
}
