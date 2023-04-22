package HW8_2;

class EmployeeUtils {
    /*
    Необходимо создать класс со следующими методами:
    поиск сотрудника в массиве по его имени (findByName)
    поиск сотрудника в массиве по вхождению указанной строки в его имени (findBySubName)
    подсчет зарплатного бюджета для всех сотрудников в массиве (sumOfSalary)
    поиск наименьшей зарплаты в массиве (minSalary)
    поиск наибольшей зарплаты в массиве (maxSalary)
    поиск наименьшего количества подчиненных в массиве менеджеров (minNumberOfSubordinates)
    поиск наибольшего количества подчиненных в массиве менеджеров (maxNumberOfSubordinates)
    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров (maxSalaryDifference)
    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров (minSalaryDifference)
     */

    public int findByName(String name, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())){
                return i;
            }
        }
        return -1;
    }

    public int findBySubName(String subName, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(subName)){
                return i;
            }
        }
        return -1;
    }

    public int sumOfSalary(Employee[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getBaseSalary();
        }
        return result;
    }

    public int maxSalary(Employee[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getBaseSalary()) {
                max = arr[i].getBaseSalary();
            }
        }
        return max;
    }

    public int minSalary(Employee[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getBaseSalary()) {
                min = arr[i].getBaseSalary();
            }
        }
        return min;
    }

    public int minNumberOfSubordinates(Manager[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getNumberOfSubordinates()) {
                min = arr[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    public int maxNumberOfSubordinates(Manager[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getNumberOfSubordinates()) {
                max = arr[i].getNumberOfSubordinates();
            }
        }
        return max;
    }

    public int maxSalaryDifference(Manager[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < (arr[i].getSalaryManager()) - arr[i].getBaseSalary()) {
                max = (arr[i].getSalaryManager()) - arr[i].getBaseSalary();
            }
        }
        return max;
    }

    public int minSalaryDifference(Manager[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > (arr[i].getSalaryManager()) - arr[i].getBaseSalary()) {
                min = (arr[i].getSalaryManager()) - arr[i].getBaseSalary();
            }
        }
        return min;
    }
}
