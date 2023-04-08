package HW10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW10_1 {

    //https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
    //Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
    public static String boolToWord(boolean b) {
        if (b == true) {
            return "Yes";
        } else {
            return "No";
        }
    }
    //https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
    //Your task is to create a function that does four basic mathematical operations.
    //The function should take three arguments - operation(string/char), value1(number), value2(number).
    //The function should return result of numbers after applying the chosen operation.
    //Examples(Operator, value1, value2) --> output
    //('+', 4, 7) --> 11
    //('-', 15, 18) --> -3
    //('*', 5, 5) --> 25
    //('/', 49, 7) --> 7
        public static int basicMath(String op, int v1, int v2) {
                if (op.equals("+")){
                    return v1 + v2;
                } else if (op.equals("-")){
                    return v1 - v2;
                } else if (op.equals("*")){
                    return v1 * v2;
                }else if (op.equals("/")){
                    return v1 / v2;
                } else {
                    return 0;
                }
    }

    //https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
    //Build a function that returns an array of integers from n to 1 where n>0.
    //Example : n=5 --> [5,4,3,2,1]
    public static String reverse(int n){
        if (n > 0){
            int [] arr = new int[n];
            for(int i = 0; i < arr.length; i++){
                arr[i] = n;
                n--;
            }
            return Arrays.toString(arr);
        } else {
            return "введите число больше нуля";
        }
    }

    //https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
    //Write a function to split a string and convert it into an array of words.
    //Examples
    //"Robin Singh" ==> ["Robin", "Singh"]
    //"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
    public static String[] stringToArray(String s) {
        if (s != null){
            return s.split(" ");
        } else {
            return new String[0];
        }
    }

    //https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java
    //Character recognition software is widely used to digitise printed texts.
    // Thus the texts can be edited, searched and stored on a computer.
    //When documents (especially pretty old ones written with a typewriter),
    // are digitised character recognition softwares often make mistakes.
    //Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
    //S is misinterpreted as 5
    //O is misinterpreted as 0
    //I is misinterpreted as 1
    //The test cases contain numbers only by mistake.
    public static String correct(String string) {
        if (string != null){
            return string.replace('5', 'S')
                    .replace('0','O')
                    .replace('1','I');
        } else {
            return "отсканируйте текст";
        }
    }

    public static void main(String[] args) {
        System.out.println("#1");
        boolean a = true;
        boolean b = false;
        System.out.println(boolToWord(a));
        System.out.println(boolToWord(b));

        System.out.println("#2");
        System.out.println(basicMath("+", 4, 7));
        System.out.println(basicMath("-", 15, 18));
        System.out.println(basicMath("*", 5, 5));
        System.out.println(basicMath("/", 49, 7));
        System.out.println(basicMath("%", 49, 7));

        System.out.println("#3");
        System.out.println(reverse(5));
        System.out.println(reverse(0));
        System.out.println(reverse(-10));

        System.out.println("#4");
        String str1 = "Robin Singh"; //==> ["Robin", "Singh"].
        System.out.println(Arrays.toString(stringToArray(str1)));
        String str2 = "I love arrays they are my favorite";
        System.out.println(Arrays.toString(stringToArray(str2)));

        System.out.println("#5");
        System.out.println(correct("HELL0 51"));
    }

}
