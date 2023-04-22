package group;

public class Meet_2 {


    public static String createPhoneNumber(int[] arr){
        if (arr != null && arr.length == 10) {
            if(arr[0] != 0) {
                String format = "(xxx) xxx-xxxx";
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 0 && arr[i] <= 9) {
                        format = format.replaceFirst("x", "" + arr[i]);
                    } else {

                        return "введите 10 цифр от 0 до 9";
                    }
                }

                return format;
            } else {

                return "номер не может начинаться с 0";
            }
        }

        return "введите 10 цифр от 0 до 9";
    }

    public static int sumWithoutMinAndMax (int[] arr) {
        if(arr != null && arr.length > 1 ){
            int sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                if(arr[i] > max){
                    max = arr[i];
                }
                if(arr[i] < min){
                    min = arr[i];
                }
            }

            return (sum - max - min);
        } else {

            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println("#1");
        /*
        https://www.codewars.com/kata/525f50e3b73515a6db000b83/java
        Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers
        in the form of a phone number.
        Example
        Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
         */

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("test1: " + createPhoneNumber(arr1));
        int[] arr2 = {0, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("test2: " + createPhoneNumber(arr2));
        int[] arr3 = {1, 2, -3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("test3: " + createPhoneNumber(arr3));
        int[] arr4 = {1, 2, 30, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("test4: " + createPhoneNumber(arr4));
        int[] arr5 = {1, 2, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("test5: " + createPhoneNumber(arr5));
        System.out.println("test6: " + createPhoneNumber(null));

        System.out.println("#2");
        /*
        https://www.codewars.com/kata/576b93db1129fcf2200001e6
        Sum all the numbers of a given array, except the highest and the lowest element (by value, not by index!).
        The highest or lowest element respectively is a single element at each edge, even if there are more than one with
        the same value. If an empty value ( null, None, Nothing etc. ) is given instead of an array,
        or the given array is an empty list or a list with only 1 element, return 0.
        Example
        { 6, 2, 1, 8, 10 } => 16
        { 1, 1, 11, 2, 3 } => 6
         */
        int[] array1 = { 6, 2, 1, 8, 10 };
        System.out.println("test1: " + sumWithoutMinAndMax(array1));

        int[] array2 = { 1, 1, 11, 2, 3 };
        System.out.println("test2: " + sumWithoutMinAndMax(array2));

        int[] array3 = {};
        System.out.println("test3: " + sumWithoutMinAndMax(array3));

        int[] array4 = {1};
        System.out.println("test4: " + sumWithoutMinAndMax(array4));

        int[] array5 = new int[2];
        System.out.println("test5: " + sumWithoutMinAndMax(array5));

        System.out.println("test6: " + sumWithoutMinAndMax(null));

    }

}
