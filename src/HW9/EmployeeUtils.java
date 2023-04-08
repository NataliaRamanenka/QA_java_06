package HW9;

import HW8_2.Employee;
import HW8_2.Manager;

public class EmployeeUtils {
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

    public static int findByName(String name, Worker[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())){
                return i;
            }
        }
        return -1;
    }

    public static int findBySubName(String subName,  Worker[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(subName)){
                return i;
            }
        }
        return -1;
    }

    public static int sumOfSalary( Worker[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getSalary();
        }
        return result;
    }

    public static int maxSalary( Worker[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getSalary()) {
                max = arr[i].getSalary();
            }
        }
        return max;
    }

    public static int minSalary(Worker[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getSalary()) {
                min = arr[i].getSalary();
            }
        }
        return min;
    }

    public static int minNumberOfSubordinates(Manager[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getNumberOfSubordinates()) {
                min = arr[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    public static int maxNumberOfSubordinates(Manager[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getNumberOfSubordinates()) {
                max = arr[i].getNumberOfSubordinates();
            }
        }
        return max;
    }

    public static int maxSalaryDifference(Worker[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < (arr[i].getSalary()) - arr[i].getBaseSalary()) {
                max = (arr[i].getSalary()) - arr[i].getBaseSalary();
            }
        }
        return max;
    }

    public static int minSalaryDifference(Worker[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > (arr[i].getSalary()) - arr[i].getBaseSalary()) {
                min = (arr[i].getSalary()) - arr[i].getBaseSalary();
            }
        }
        return min;
    }
}
