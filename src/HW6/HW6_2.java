package HW6;

public class HW6_2 {
    public static void main(String[] args) {

        //Задача №1
        //Дана строка:String s = “Перестановочный алгоритм быстрого действия”;
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)
        System.out.println("******* 1 *******");
        String s1 = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == 'о'){
                System.out.print(s1.charAt(i));
            }
        }
        System.out.println();

        //Задача №2
        //Дана строка:
        //String s = “Перевыборы выбранного президента”;
        //необходимо подсчитать количество букв “е” в строке.
        //Для указанной строки ответ будет 4.
        System.out.println("******* 2 *******");
        String s2 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i) == 'е'){
                count++;
            }
        }
        System.out.println(count);

        //Задача №3
        //Дана строка:
        //String s = “Посмотрите как Рите нравится ритм”;
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.
        System.out.println("******* 3 *******");
        String s3 = "Посмотрите как Рите нравится ритм";
        int index = s3.toLowerCase().indexOf("рит");
        while (index != -1) {
            System.out.print(index + ", ");
            index = s3.toLowerCase().indexOf("рит", index + 1);
        }
        System.out.println();

//        for (int i = 0; i < s3.length(); i++) {
//            if(s3.toLowerCase().indexOf("рит") != index){
//                index = s3.toLowerCase().indexOf("рит");
//                System.out.println(i);;
//            }
//        }

        //Экстра задача
        //Дан массив:
        //String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        System.out.println("******* 4 *******");
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
