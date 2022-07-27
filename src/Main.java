import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

//    ### Задание 1
//    Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
//    Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//    в формате: «Сумма трат за месяц составила … рублей».
        System.out.println("Задание 1");
        double sum =arr[0];
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + Math.round(sum*100.00)/100.00 + " рублей");

//        Задание 2
//        Следующая задача — найти минимальную и максимальную трату за день.
//        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат
//        за день составила … рублей»
        System.out.println("Задание 2");
        double max = arr[0];
        double min = arr[arr.length-1];
        for (int i=1; i<arr.length-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + Math.round(min*100.00)/100.00 + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + Math.round(max*100.00)/100.00 +  " рублей");

//      Задание 3
//        А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
//        Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат
//        за месяц поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат
//        за месяц составила … рублей».
        System.out.println("Задание 3");
        double averageValue = sum/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + Math.round(averageValue*100.00)/100.00 + " рублей");

//### Задание 4
//        Отойдем от подсчетов.
//        В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О. сотрудников начали
//        отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
//        Данные с именами сотрудников хранятся в виде массива символов (char[]).
//        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
//        В качестве данных для массива используйте:
//        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        В результате в консоль должно быть выведено "Ivanov Ivan".
//        **Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно
//        пройти по массиву циклом и распечатать его элементы в правильном порядке.
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int name = reverseFullName.length-1;
        while (name>0) {
            System.out.print(reverseFullName[name]);
            name--;
        }
            System.out.print(reverseFullName[0]);
    }
}