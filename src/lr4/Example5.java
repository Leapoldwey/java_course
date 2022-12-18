package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Random random = new Random(200);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество  столбцов массива: ");
        int x = in.nextInt();
        System.out.print("Введите количество строк массива: ");
        int y = in.nextInt();
        int[][] arr1 = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr1[i][j] = random.nextInt(200);
                System.out.println("i = " + i + "; j= " + j + "; value= " + arr1[i][j]);
            }
        }
        System.out.println();
        int[][] arr2 = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                arr2[i][j] = arr1[j][i];
                System.out.println("i = " + i + ";j= " + j + ";value= " + arr2[i][j]);
            }
        }
        in.close();
    }
}
/*
5. Напишите программу, в которой создается двумерный целочисленный
массив. Он заполняется случайными числами. Затем в этом массиве строи и
столбцы меняются местами: первая строка становится первым столбцом,
вторая строка становиться вторым столбцом и так далее. Например, если
исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
из 5 строк и 3 столбцов.
 */
