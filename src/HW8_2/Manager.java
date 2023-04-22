package HW8_2;

class Manager extends BaseManager{
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

    public int getSalaryManager() {
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else {
            return (int)(getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        }
    }
}
