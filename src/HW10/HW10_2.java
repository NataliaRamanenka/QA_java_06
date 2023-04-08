package HW10;

import java.util.Locale;

public class HW10_2 {

    //https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
    //Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
    //The output should be two capital letters with a dot separating them.
    //It should look like this:
    //Sam Harris => S.H
    //patrick feeney => P.F
    public static String abbrevName(String name) {
        if (name != null && name.contains(" ")) {
            String[] arr = name.toUpperCase().split(" ");
            String abbrev = "";
            for (int i = 0; i < arr.length; i++) {
                if (i >= 0 && i < arr.length - 1) {
                    abbrev += arr[i].charAt(0) + ".";
                } else {
                    abbrev += arr[i].charAt(0);
                }
            }
            return abbrev;
        } else {
            return "введите корректные данные";
        }
    }

    //https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
    //All of the animals are having a feast! Each animal is bringing one dish. There is just one rule:
    // the dish must start and end with the same letters as the animal's name.
    // For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
    //Write a function feast that takes the animal's name and dish as arguments and returns true or false
    // to indicate whether the beast is allowed to bring the dish to the feast.
    //Assume that beast and dish are always lowercase strings, and that each has at least two letters.
    // beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
    // They will not contain numerals.
    public static boolean feast(String beast, String dish) {
        if (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1)) {

            return true;
        } else {

            return false;
        }
    }

    //https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
    //Create a function that will return a string that combines all of the letters of the three inputed strings
    // in groups. Taking the first letter of all of the inputs and grouping them next to each other.
    // Do this for every letter, see example below!
    //E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
    //Note: You can expect all of the inputs to be the same length.
    public static String tripleTrouble(String one, String two, String three) {
        if (one.length() == two.length() && one.length() == three.length()) {
            String str = "";
            for (int i = 0; i < one.length(); i++) {
                str = str + one.charAt(i) + two.charAt(i) + three.charAt(i);
            }

            return str;
        }

        return "введите данные одинаковой длины";
    }

    //https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
    //When provided with a letter, return its position in the alphabet.
    //Input :: "a"
    //Ouput :: "Position of alphabet: 1"
    public static String position(char alphabet) {
        if (((int) alphabet >= 65 && (int) alphabet <= 90) || ((int) alphabet >= 97 && (int) alphabet <= 122)) {

            return "" + ((int) alphabet - ((int) alphabet - 1));
        }

        return "введите английскую букву";
    }

    //https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
    //I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements.
    // I'll appreciate for your help.
    //P.S. Each array includes only integer numbers. Output is a number too.
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        if (arr1 != null && arr2 != null) {
            int sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                sum += arr2[i];
            }

            return sum;
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println("#1");
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("patrick feeney"));
        System.out.println(abbrevName("Sam"));

        System.out.println("#2");
        System.out.println(feast("great blue heron", "garlic naan"));
        System.out.println(feast("chickadee", "chocolate cake"));
        System.out.println(feast("chickadee", "milk cake"));

        System.out.println("#3");
        System.out.println(tripleTrouble("aa", "bb", "cc"));

        System.out.println("#4");
        System.out.println(position('a'));
        System.out.println(position('A'));
        System.out.println(position('-'));

        System.out.println("#5");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7};
        System.out.println(arrayPlusArray(arr1, arr2));

        int[] arr3 = {};
        System.out.println(arrayPlusArray(arr2, arr3));

        int[] arr4 = {};
        System.out.println(arrayPlusArray(arr3, arr4));
    }
}
