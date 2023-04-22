package HW9;

class Worker extends Employee {
/*
Необходимо создать класс Worker где метод getSalaryWorker  будет возвращать зарплату, базовую ставку.
 */

    public Worker(String name, int baseSalary) {
        super(name, baseSalary);
    }

    public int getSalary(){
        return getBaseSalary();
    }

    @Override
    public String toString() {
        return "Worker{Name " + getName() + ", Salary " + getBaseSalary() + "}";
    }
}
