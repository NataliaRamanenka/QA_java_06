package HW7_1;

class Person {
        /*
        Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
        метод возвращает имя с префиксом “Mr. ”если пол указан как мужской и префикс “Mrs. ” если женский.
        */
        String name;
        int age;
        char sex;

        public String getName() {
            if (sex == 'M') {
                return "Wr." + name;
            } else {
                return "Wrs." + name;
            }
        }


    }

