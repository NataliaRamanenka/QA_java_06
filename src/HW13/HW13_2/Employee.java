package HW13.HW13_2;

public final class Employee extends BaseEmployee{
    //● Классы Employee и Manager должны быть финальными
    //Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день. Все поля
    //сделать приватными и для каждого поля добавить методы set и get. Класс должен иметь
    //метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые
    //были переданы в качестве аргумента. ---- переносим все в BaseEmployee!!!

    public Employee(String name, int age, char sex, int daySalary) {
        super(name, age, sex, daySalary);
    }
}
