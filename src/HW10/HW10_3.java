package HW10;

public class HW10_3 {

    //https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/train/java
    //Write a function which converts the input string to uppercase.
    public static String makeUpperCase(String str){
        if(str != null && str.length() > 0){

            return str.toUpperCase();
        } else {

            return "введите строку";
        }
    }

    //https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
    //Your goal is to create a function that removes the first and last characters of a string. You're given one
    // parameter, the original string. You don't have to worry with strings with less than two characters.
    public static String removeOneAndLastChar(String str) {
        if(str != null && str.length() > 0){

            return str.substring(1, (str.length() - 1));
        } else {

            return "введите строку";
        }
    }

    //https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/java
    //Write a function that removes the spaces from the string, then return the resultant string.
    public static String noSpace(final String str) {
        if(str != null && str.length() > 0){

            return str.replace(" ", "");
        } else {

            return "введите строку";
        }
    }

    //https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java
    //You're writing code to control your town's traffic lights. You need a function to handle each change from green,
    // to yellow, to red, and then to green again.
    //Complete the function that takes a string as an argument representing the current state of the light and
    // returns a string representing the state the light should change to.
    //For example, when the input is green, output should be yellow.
    public static String updateLight(String current) {
        if (current != null && (current.equals("green") || current.equals("yellow") || current.equals("red"))) {
            switch (current) {
                case "green":
                    return "red";
                case "red":
                    return "yellow";
                case "yellow":
                    return "green";
            }
        }

        return "введите текущий цвет светофора";
    }

    //https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java
    //Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated
    // exactly n times.
    public static String repeatStr(int repeat, String string) {
        if (repeat > 0) {
            if (string != null && string.length() > 0) {

                return string.repeat(repeat);
            } else {

                return "введите строку";
            }
        }
        return "введите положительное число повторений";
    }


    public static void main(String[] args) {
        System.out.println("#1");
        System.out.println(makeUpperCase("hi!"));
        System.out.println(makeUpperCase(null));
        System.out.println(makeUpperCase(""));

        System.out.println("#2");
        System.out.println(removeOneAndLastChar("abcd"));
        System.out.println(removeOneAndLastChar(null));

        System.out.println("#3");
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        System.out.println(noSpace("8aaaaa dddd r     "));
        System.out.println(noSpace(null));

        System.out.println("#4");
        System.out.println(updateLight("green"));
        System.out.println(updateLight("red"));
        System.out.println(updateLight("yellow"));
        System.out.println(updateLight(""));
        System.out.println(updateLight(null));

        System.out.println("#5");
        System.out.println(repeatStr(6,"I"));
        System.out.println(repeatStr(5, "Hello"));
        System.out.println(repeatStr(-6,"I"));
        System.out.println(repeatStr(6,""));
        System.out.println(repeatStr(6,null));
    }
}
