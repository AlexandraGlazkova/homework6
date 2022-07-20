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
        int sum =arr[0];
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

//        Задание 2
//        Следующая задача — найти минимальную и максимальную трату за день.
//        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат
//        за день составила … рублей»
        System.out.println("Задание 2");
        int max = arr[0];
        int min = arr[arr.length-1];
        for (int i=1; i<arr.length-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max +  " рублей");


    }
}