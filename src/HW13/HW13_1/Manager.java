package HW13.HW13_1;

final class Manager extends Employee {

    //Необходимо создать класс Manager в который нужно добавить следующие методы:
    //getNumberOfSubordinates - получить количество подчиненных
    //setNumberOfSubordinates
    //в классе, метод getSalary будет возвращать значение по формуле -
    //<базовая ставка> * (<количество подчиненных> / 100 * 3).
    //Если количество подчиненных 0, то результат как у обычного рабочего.
    //Коэффициент для расчета ЗП у Manager должны быть константами (коэффициент из формулы расчета ЗП)
    //Классы Manager

    private int numberOfSubordinates;

    private final int SALARY_COEFFICIENT = 3;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSALARY_COEFFICIENT() {
        return SALARY_COEFFICIENT;
    }

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0){
            return super.getBaseSalary();
        } else {
            return (int)(super.getBaseSalary() * (getNumberOfSubordinates() / 100.0 * SALARY_COEFFICIENT));
        }
    }

    @Override
    public String toString() {
        return "Manager{Name " + getName()
                + ", Salary " + getSalary()
                +  ", NumberOfSubordinates "
                + getNumberOfSubordinates()+ "}";
    }
}
