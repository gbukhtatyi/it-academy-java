package Homework7;

public class TimePeriod {
    protected int hours = 0;
    protected int minutes = 0;
    protected int seconds = 0;

    public TimePeriod(int seconds) {
        this.seconds = seconds % 60;
        this.minutes = seconds / 60 % 60;
        this.hours = seconds / 3600;
    }

    public TimePeriod(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public boolean equals(TimePeriod period) {
        return toSeconds() == period.toSeconds();
    }

    public int toSeconds() {
        return hours * 3600 + minutes * 6 + seconds;
    }

    public String toTimeString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
