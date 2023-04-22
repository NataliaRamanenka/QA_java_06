package group;

public class Meet_1 {
    public static Long compositionOfNaturals (int start, int end, int step) {
        Long composition = 1L;
        for (int i = start; i <= end; i++) {
            composition =  composition * i;
        }
        return composition;
    }

    public static String removeExclamationMarks(String str){
        if (!str.isEmpty()){
            return str.replace("!","");}
        else {
            return "null";
        }
    }

    public static void main(String[] args) {
      /*
    Посчитать произведение всех натуральных чисел от 4 до 47 включительно и вывести в консоль.
     */
        System.out.println(compositionOfNaturals(4,47, 1));

        /*
        https://www.codewars.com/kata/57a0885cbb9944e24c00008e/java
        Write function Remove Exclamation Marks which removes all exclamation marks from a given string.
         */
        String str = "Hi!";
        System.out.println(removeExclamationMarks(str));
     }

}
