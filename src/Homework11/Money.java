package Homework11;

public class Money {
    protected int units;
    protected int division;

    public Money(int units, int division) {
        this.units = units;
        this.division = division;

        processDivision();
    }

    protected void processDivision() {
        if (division > 99 || division < -99) {
            units += division / 100;
            division %= 100;
        }

        if (division < 0 && units > 0) {
            units -= 1;
            division = 100 + division;
            processDivision();
        }

        if (division < 0) {
            division = 0;
        }
    }

    public int getUnits() {
        return units;
    }

    public int getDivision() {
        return division;
    }

    public void add(Money obj) {
        units += obj.getUnits();
        division += obj.getDivision();

        processDivision();
    }

    public void subtract(Money obj) {
        if (isGreater(obj)) {
            units -= obj.getUnits();
            division -= obj.getDivision();
            processDivision();
        } else {
            System.out.println("Ошибка! Невозможно отнять отменьшего числа большее число.");
        }
    }

    public int compareTo(Money obj) {
        if (this.getUnits() > obj.getUnits()
                || (this.getUnits() == obj.getUnits() && this.getDivision() > obj.getDivision())) {
            return 1;
        } else if (this.getUnits() == obj.getUnits() && this.getDivision() == obj.getDivision()) {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean isGreater(Money obj) {
        return compareTo(obj) == 1;
    }

    public String toString() {
        return units + " " + getUnitsPrefix(units) + " " + division + " " + getDivisionPrefix(division);
    }

    protected String getUnitsPrefix(int value) {
        return getPrefix(value, new String[]{
                "рубль",
                "рубля",
                "рублей",
        });
    }

    protected String getDivisionPrefix(int value) {
        return getPrefix(value, new String[]{
                "копейка",
                "копейки",
                "копеек",
        });
    }

    protected String getPrefix(int value, String[] prefix) {
        int tens = value % 100;
        int units = value % 10;

        if (11 <= tens && tens <= 19) {
            return prefix[2];
        } else if (units == 1) {
            return prefix[0];
        } else if (2 <= units && units <= 4) {
            return prefix[1];
        } else {
            return prefix[2];
        }
    }

}
