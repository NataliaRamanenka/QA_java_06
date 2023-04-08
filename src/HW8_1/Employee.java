package HW8_1;

public class Employee {
    /*
    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день. Все поля сделать приватными и
    для каждого поля добавить методы set и get. Класс должен иметь метод - getSalary(int days),
    метод возвращает зарплату за количество дней которые были переданы в качестве аргумента.
     */
    private String name;
    private int age;
    private char sex;
    private int daySalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

    public int getSalary(int days) {
        return daySalary * days;
    }

    public Employee(String name, int age, char sex, int daySalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.daySalary = daySalary;
    }
}
