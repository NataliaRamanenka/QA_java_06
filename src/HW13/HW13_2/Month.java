package HW13.HW13_2;
public class Month {

    //Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
    //Класс Month сделать неизменяемым (immutable).

    private final String NAME;
    private final int DAYS;
    private final int WORKDAYS;

    public Month(String NAME, int DAYS, int WORKDAYS) {
        this.NAME = NAME;
        this.DAYS = DAYS;
        this.WORKDAYS = WORKDAYS;
    }

    public String getNAME() {
        return NAME;
    }

    public int getDAYS() {
        return DAYS;
    }

    public int getWORKDAYS() {
        return WORKDAYS;
    }
}

