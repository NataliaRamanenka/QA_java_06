package group;

public class Meet_3 {
    //https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
    //Complete the solution so that the function will break up camel casing, using a space between words.

    public static String camelCase(String input) {
        if (input != null && input.length() > 0) {
            String result = "" + input.charAt(0);
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
                    result = result + " " + input.charAt(i);
                } else {
                    result = result + input.charAt(i);
                }
            }

            return result;
        } else {

            return "введите строку";
        }
    }

    //https://www.codewars.com/kata/51c8991dee245d7ddf00000e/java
    //Complete the solution so that it reverses all of the words within the string passed in.
    //Words are separated by exactly one space and there are no leading or trailing spaces.
    public static String reverse(String input) {
        if (input != null && input.length() > 0) {
            String[] arr = input.split(" ");
            System.out.println(arr.length);
            String result = "";
            for (int i = (arr.length - 1); i >= 0; i--) {
                if (i != 0) {
                    result = result + arr[i] + " ";
                } else {
                    result = result + arr[i];
                }
            }
            return result;
        } else {

            return "введите предложение";
        }

    }

    public static void main(String[] args) {
        System.out.println("#1");
        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("identifier"));
        System.out.println(camelCase("ILikeIt"));
        System.out.println(camelCase(""));
        System.out.println(camelCase(null));

        System.out.println("#2");
        System.out.println(reverse("The greatest victory is that which requires no battle"));
        System.out.println(reverse(""));
        System.out.println(reverse(null));
    }
}
