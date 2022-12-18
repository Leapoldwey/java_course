package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int x = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int y = in.nextInt();
        int[][] arrSnake = new int[x][y];
        int hvost = 0;
        int body = 0;
        int countLine = 0;
        for (int i = 0; countLine < arrSnake.length; countLine++) {
            for (int j = 0; j < (arrSnake[i].length - hvost); j++) {
                arrSnake[i][j] = body;
                body++;
            }
            if(i < arrSnake.length - 1) {
                i++;}
            for (int k = x - 1; k > hvost; k--) {
                arrSnake[k][arrSnake[i].length - 1 - hvost] = body;
                body++;
            }
            hvost++;
        }
        int z = 0;
        for (int i = 0; i < arrSnake.length; i++){
            int count = i + 1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < arrSnake[i].length; j++){
                System.out.print(arrSnake[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
            in.close();
        }
    }
}
/*
7. Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее.
 */