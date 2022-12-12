package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");

        int sizeArr = in.nextInt();
        int arr[] = new int[sizeArr];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] " + arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("\n" + "Произведена сортировка массива" + "\n");
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.println("Элемент массива ["+i+"] после сортировки = " + arr[i]);
        }
    }
}
/*
Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.
 */
