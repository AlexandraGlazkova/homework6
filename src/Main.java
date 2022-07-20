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


    }
}