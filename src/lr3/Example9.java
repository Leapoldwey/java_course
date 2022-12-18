package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");

        int sizeArr = in.nextInt();
        System.out.println("Размер массива равен: " + sizeArr);
        int arr[] = new int[sizeArr];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] " + arr[i]);
        }
        int[] min_count = new int[sizeArr];
        int[] min_nums = new int[sizeArr];
        int min = arr[0];
        for (int l = 0; l < 2; l++) {
            for (int j = 0; j < arr.length; j++) {
                if (min >= arr[j]) {
                    min_count[j] = j;
                    min = arr[j];
                    min_nums[j] = arr[j];
                } else {
                    min_count[j] = 0;
                    min_nums[j] = 0;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (min_nums[k] == min && min_count[k] != 0) {
                System.out.println("Элемент массива [" + min_count[k] + "] " + min_nums[k] + " - минимальное значение");
            }
        }
    }
}
/*
9. Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.
 */
