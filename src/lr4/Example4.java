package lr4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int height = in.nextInt();
        int [][] arr = new int [height][];
        for (int i = 0; i < arr.length; i++){
            int j = i + 1;
            arr[i] = new int[j];
        }
        int countSim = 0;
        for (int i = 0; i < height; i++){
            for (int j = 0; j < i + 1; j++){
                arr[i][j] = 7;
            }
        }
        for (int i = 0; i < height; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
                countSim++;
            }
            System.out.println(" Количество символов в строке " + countSim);
            countSim = 0;
            in.close();
        }
        }
    }
/*
4. Напишите программу, в которой создается двумерный массив, который
выводит прямоугольный треугольник;
 */