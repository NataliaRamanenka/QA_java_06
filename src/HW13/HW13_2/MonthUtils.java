package HW13.HW13_2;

public class MonthUtils {
    //Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования
    // (объекты класса Month).
    //Статические поля с объектами месяцев должны быть финальными
    //Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.
    public static class Month {
        private final String NAME;
        private final int DAYS;
        private final int WORKDAYS;

        public Month(String NAME, int DAYS, int WORKDAYS) {
            this.NAME = NAME;
            this.DAYS = DAYS;
            this.WORKDAYS = WORKDAYS;
        }
    }

    public static final Month JANUARY = new Month("January", 31, 21);
    public static final Month FEBRUARY = new Month("February", 28, 20);
    public static final Month MARCH = new Month("March", 31, 22);
    public static final Month APRIL = new Month("April", 30, 19);
    public static final Month MAY = new Month("May", 31, 21);
    public static final Month JUNE = new Month("June", 30, 22);
    public static final Month JULY = new Month("July", 31, 20);
    public static final Month AUGUST = new Month("August", 31, 23);
    public static final Month SEPTEMBER = new Month("September", 30, 21);
    public static final Month OCTOBER = new Month("October", 31, 22);
    public static final Month NOVEMBER = new Month("November", 30, 21);
    public static final Month DECEMBER = new Month("December", 31, 20);

    public static final Month[] QUARTER1 = new Month[]{JANUARY, FEBRUARY, MARCH};
    public static final Month[] QUARTER2 = new Month[]{APRIL, MAY, JUNE};
    public static final Month[] QUARTER3 = new Month[]{JULY, AUGUST, SEPTEMBER};
    public static final Month[] QUARTER4 = new Month[]{OCTOBER, NOVEMBER, DECEMBER};

    public static final Month[] HALFYEAR1 = new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};
    public static final Month[] HALFYEAR2 = new Month[]{JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    public static final Month[] YEAR = new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    public static Month[] getYearQuarter(int quarterNumber) {
        if (quarterNumber == 1) {
            return QUARTER1;
        } else if (quarterNumber == 2) {
            return QUARTER2;
        } else if (quarterNumber == 3) {
            return QUARTER3;
        } else if (quarterNumber == 4) {
            return QUARTER4;
        }
        return null;
    }
    public static Month[] getHalfYear(int halfYearNumber) {
        if (halfYearNumber == 1) {
            return HALFYEAR1;
        } else if (halfYearNumber == 2) {
            return HALFYEAR2;

        }
        return null;
    }

    public static Month[] getYearQuarter1() {
        return QUARTER1;
    }

    public static Month[] getYearQuarter2() {
        return QUARTER2;
    }

    public static Month[] getYearQuarter3() {
        return QUARTER3;
    }

    public static Month[] getYearQuarter4() {
        return QUARTER4;
    }

    public static Month[] getHalfYear1() {
        return HALFYEAR1;
    }

    public static Month[] getHalfYear2() {
        return HALFYEAR2;
    }

    public static Month[] getYear() {
        return YEAR;
    }

}
