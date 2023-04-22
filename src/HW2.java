public class HW2 {

    public static void main(String[] args) {

    //1. Необходимо создать целочисленные переменные a и b, присвоить произвольные
    // значения переменным на ваш выбор и вывести результаты следующих операций с этими
    // переменными: сложение, умножение, вычитание, деление.
        System.out.println("******* 1 *******");
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a * 1.0 / b));
        System.out.println("a / b = " + ((double)a / b));
        System.out.println("a * b = " + (a * b));

        //2. Также вывести остаток от деления и сделать проверку на четность этих переменных.
        System.out.println("******* 2 *******");
        System.out.println("a mod b = "  + (a % b));
        System.out.println("a is even = "  + (a % 2 == 0));
        System.out.println("b is even = "  + (b % 2 == 0));

        //3. Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
        System.out.println("******* 3 *******");
        System.out.println("\uD83D\uDE01");
    }


}
