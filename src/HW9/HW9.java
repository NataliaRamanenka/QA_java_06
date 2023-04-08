package HW9;

import java.text.Format;

public class HW9 {

    public static void main(String[] args) {
        /*
        Необходимо реализовать задание из Task 8.2 со следующими условиями:
        Все методы возвращающие ЗП должны называться getSalary
        Все методы в утилитарном классе должны быть static
         */

        Worker Alex = new Worker("Alex", 1000);
        Worker Jane = new Manager("Jane",5000,10);
        Worker John = new Director("John",10000,3);

        Worker [] workers = {Alex, Jane, John};

        for (int i = 0; i < workers.length; i++){
            System.out.println(workers[i]);
        }

        System.out.println(Alex.getSalary());
        System.out.println(Jane.getSalary());
        System.out.println(John.getSalary());

        for (int i = 0; i < workers.length; i++){
            System.out.println(workers[i].getSalary());
        }

        System.out.println(EmployeeUtils.findByName("Alex",workers));
        System.out.println(EmployeeUtils.maxSalary(workers));
    }
}
