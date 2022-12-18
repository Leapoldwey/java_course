package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры массива: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }
        System.out.println("До удаления");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("После удаления");
        int delX = random.nextInt(x - 1);
        int delY = random.nextInt(y - 1);
        int[][] arr2 = new int[x - 1][y - 1];
        for (int i = 0, r = 0; i < x - 1; r++) {
            if (r != delX) {
                for (int j = 0, r2 = 0; j < y - 1; r2++) {
                    if (r2 != delY) {
                        arr2[i][j] = arr[r][r2];
                        System.out.print(arr2[i][j] + " ");
                        j++;
                    }
                }
            i++;
            }
            System.out.println();
            in.close();
        }
    }
}

/*
6. Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.

 */