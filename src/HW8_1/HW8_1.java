package HW8_1;

class HW8_1 {

    public static void main(String[] args) {
    Employee Alex = new Employee("Alex", 35, 'M', 100);
    System.out.println(Alex.getSalary(20));
    Manager Jane = new Manager("Jane", 39, 'W', 100, 10);
    System.out.println(Jane.getSalary(20));


    }
}
