package HW13.HW13_2;

public final class Manager extends BaseEmployee {
    //Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество
//подчиненных. Все поля сделать приватными и для каждого поля добавить методы set и
//get. Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает
//зарплату за те месяцы которые были переданы в качестве аргумента.
//К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
    private int numberOfSubordinates;

    public Manager(String name, int age, char sex, int daySalary, int numberOfSubordinates) {
        super(name, age, sex, daySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        return (int) (super.getSalary(monthArray) * (1.0 + getNumberOfSubordinates() / 100));
    }
}
