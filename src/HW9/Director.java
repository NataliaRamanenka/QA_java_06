package HW9;

class Director extends BaseManager {
    /*
    Необходимо создать класс Director, метод getSalaryDirector должен возвращать результат по формуле -
    <базовая ставка> * (<количество подчиненных> / 100 * 9).
    Если количество подчиненных 0, то результат как у обычного рабочего.
     */

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0){
            return super.getSalary();
        } else {
            return (int)(super.getSalary() * (getNumberOfSubordinates() / 100.0 * 9));
        }
    }

    @Override
    public String toString() {
        return "Director{Name " + getName() + ", Salary " + getSalary() +  ", NumberOfSubordinates " + getNumberOfSubordinates()+ "}";
    }
}
