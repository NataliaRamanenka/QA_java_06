package HW9;

class Manager extends BaseManager {
    /*
    Необходимо создать класс Manager в который нужно добавить следующие методы:
    getNumberOfSubordinates - получить количество подчиненных
    setNumberOfSubordinates
    в классе, метод getSalaryManager будет возвращать значение по формуле -
    <базовая ставка> * (<количество подчиненных> / 100 * 3).
    Если количество подчиненных 0, то результат как у обычного рабочего.
     */
    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0){
            return super.getSalary();
        } else {
            return (int)(super.getSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        }
    }

    @Override
    public String toString() {
        return "Manager{Name " + getName() + ", Salary " + getSalary() +  ", NumberOfSubordinates " + getNumberOfSubordinates()+ "}";
    }
}
