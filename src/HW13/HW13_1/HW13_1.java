package HW13.HW13_1;

class HW13_1 {
    public static void main(String[] args) {
        Employee Alex = new Worker("Alex", 1000);
        Employee Jane = new Manager("Jane",5000,10);
        Employee John = new Director("John",10000,3);

        Employee[] employees = {Alex, Jane, John};

        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }

        System.out.println(Alex.getSalary());
        System.out.println(Jane.getSalary());
        System.out.println(John.getSalary());

        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getSalary());
        }

    }
}
