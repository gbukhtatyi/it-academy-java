package Homework7;

public class TimePeriod {
    protected int timeInSeconds = 0;
    protected int timeHours = 0;
    protected int timeMinutes = 0;
    protected int timeSeconds = 0;


    public TimePeriod(int seconds) {
        timeInSeconds = seconds;

        timeSeconds = timeInSeconds % 60;
        timeMinutes = timeInSeconds / 60 % 60;
        timeHours = timeInSeconds / 3600;
    }

    public TimePeriod(int hours, int minutes, int seconds) {
        timeHours = hours;
        timeMinutes = minutes;
        timeSeconds = seconds;

        timeInSeconds = seconds + minutes * 60 + hours * 3600;
    }

    public boolean equals(TimePeriod period) {
        return timeInSeconds == period.toSeconds();
    }

    public int toSeconds() {
        return timeInSeconds;
    }

    public String toTimeString() {
        return timeHours + ":" + timeMinutes + ":" + timeSeconds;
    }
}
