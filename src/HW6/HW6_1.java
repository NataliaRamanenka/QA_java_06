package HW6;

public class HW6_1 {

    public static void main(String[] args) {
        //Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //Задача №1 необходимо вывести сумму всех значений массива.
        System.out.println("******* 1 *******");
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);

        //Задача №2 необходимо вывести максимальное значение массива.
        System.out.println("******* 2 *******");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("min = " + min);

        //Задача №3 необходимо вывести минимальное значение массива.
        System.out.println("******* 3 *******");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        //Задача №4
        //Дан массив:int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.
        System.out.println("******* 4 *******");
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sum = 0;
        for (int i = 0; i < array4.length; i++) {
            sum += array4[i];
        }
        System.out.println("avg= " + sum * 1.0 / array4.length);

        //Дан массив:int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //Задача №5 необходимо вывести сумму элементов массива.
        System.out.println("******* 5 *******");
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        sum = 0;
        for (int i = 0; i < array5.length; i++) {
            for(int j = 0; j < array5[i].length; j++) {
                sum += array5[i][j];
            }
        }
        System.out.println("sum = " + sum);

        //Задача №6 необходимо вывести максимальное значение массива.
        System.out.println("******* 6 *******");
        max = Integer.MIN_VALUE;
        for (int i = 0; i < array5.length; i++) {
            for(int j = 0; j < array5[i].length; j++) {
                if(max < array5[i][j]){
                    max = array5[i][j];
                }
            }
        }
        System.out.println("max = " + max);

        //Задача №7 необходимо вывести количество элементов в массиве.
        System.out.println("******* 7 *******");
        int n = 0;
        for (int i = 0; i < array5.length; i++) {
            n += array5[i].length;
        }
        System.out.println("n = " + n);
    }
}
