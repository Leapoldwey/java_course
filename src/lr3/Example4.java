package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите два числа: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1,num2);

        int res = max - min;
        int sum = 0;


        for (int i = min; i <= max; i++){
            System.out.println("Цикл for: " + i);
        }
        System.out.println("\n");

        while (min <= max){
            System.out.println("Цикл while: " + min);
            min += 1;
            in.close();
        }
        }

    }
/*
4. Напишите программу, в которой пользователем вводится два
целых числа. Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
чисел). Предложите разные версии программы (с использованием разных
операторов цикла).

 */