package HW8_1;

public class Manager extends Employee{
    /*
     Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
     Все поля сделать приватными и для каждого поля добавить методы set и get. Класс должен иметь метод -
     getSalary(int days), метод возвращает зарплату за количество дней которые были переданы в качестве аргумента.
     К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
      */
    public int getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }

    private int subordinates;
    @Override
    public int getSalary(int days) {
        return (int) (super.getSalary(days) * (1 + subordinates / 100.0));
    }

    public Manager(String name, int age, char sex, int daySalary, int subordinates) {
        super(name, age, sex, daySalary);
        this.subordinates = subordinates;
    }
}
