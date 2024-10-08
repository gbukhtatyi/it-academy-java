package Homework7;

public class Homework7 {

    public static void main(String[] args) {
        TimePeriod timePeriodBySeconds = new TimePeriod(3681);
        System.out.println("Created time by seconds.");
        System.out.println("Time in seconds: " + timePeriodBySeconds.toSeconds());
        System.out.println("Time in string: " + timePeriodBySeconds.toTimeString());

        TimePeriod timePeriodByTime = new TimePeriod(1, 1, 3);
        System.out.println("Created time by hour minute and seconds.");
        System.out.println("Time in seconds: " + timePeriodByTime.toSeconds());
        System.out.println("Time in string: " + timePeriodByTime.toTimeString());

        System.out.println("Comparison:");
        if (timePeriodByTime.equals(timePeriodBySeconds)) {
            System.out.println("Times is equal.");
        } else {
            System.out.println("Times is not equal.");
        }
    }
}
