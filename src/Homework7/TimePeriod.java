package Homework7;

public class TimePeriod {
    protected int currentSeconds = 0;

    public TimePeriod(int seconds) {
        currentSeconds = seconds;
    }

    public TimePeriod(int hours, int minutes, int seconds) {
        currentSeconds = seconds + minutes * 60 + hours * 3600;
    }

    public boolean equals(TimePeriod period) {
        return currentSeconds == period.toSeconds();
    }

    public int toSeconds() {
        return currentSeconds;
    }

    public String toTimeString() {
        int seconds = currentSeconds % 60;
        int minutes = currentSeconds / 60 % 60 ;
        int hours = currentSeconds / 3600;

        return hours + ":" + minutes + ":" + seconds;
    }
}
