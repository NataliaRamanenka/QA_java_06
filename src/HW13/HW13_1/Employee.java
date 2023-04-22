package HW13.HW13_1;

abstract class Employee {

    //Необходимо создать класс Employee со следующими методами:
    //getBaseSalary - получить базовую ставку
    //setBaseSalary
    //getName - получить имя
    //setName
    //getSalary - получить зарплату (должен быть абстрактный)

    private String name;
    private int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract int getSalary();


}
