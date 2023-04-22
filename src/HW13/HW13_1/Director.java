package HW13.HW13_1;

final class Director extends Employee {

    // Необходимо создать класс Director с теми же методами, что и Manager,
    // но метод getSalary должен возвращать результат по формуле -
    // <базовая ставка> * (<количество подчиненных> / 100 * 9).
    // Если количество подчиненных 0, то результат как у обычного рабочего.
    // Коэффициент для расчета ЗП Director должны быть константами (коэффициенты из формулы расчета ЗП)
    // Класс Director должен быть финальным

    private int numberOfSubordinates;
    private final int SALARY_COEFFICIENT = 9;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSALARY_COEFFICIENT() {
        return SALARY_COEFFICIENT;
    }

    public Director(String name, int baseSalary, int numberOfSubordinates) {
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
        return "Director{Name " + getName() + ", Salary " + getSalary() +  ", NumberOfSubordinates " + getNumberOfSubordinates()+ "}";
    }
}
