import java.util.Arrays;
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
        int sum =0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


    }
}