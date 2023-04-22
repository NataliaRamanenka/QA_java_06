import java.util.Scanner;

public class HW12_scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите 2 числа");
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println("введите действие + - * /");
        char action = sc.next().charAt(0);

        switch (action){
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            default: System.out.println("введите корректное действие");

        }



    }
}
