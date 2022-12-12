package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину последовательности чисел Фибоначчи: ");
        int nums = in.nextInt();
        int arr[] = new int[nums];
        int num1 = 2;
        arr[0] = 0;
        arr[1] = 1;
        System.out.println("Цикл while: " + 1);

        while (num1 < arr.length){
            arr[num1] = arr[num1 - 1] + arr[num1 - 2];
            System.out.println("Цикл while: " + arr[num1]);
            num1++;
        }
        System.out.println("\n");

        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        } for (int n = 1; n < arr.length; n++){
            System.out.println("Цикл for: " + arr[n]);
            in.close();
        }
    }
}

/*
3. Напишите программу, которая выводит последовательность чисел
Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
следующее число равно сумме двух предыдущих
(получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
в последовательности вводится пользователем. Предложите версии
программы, использующие разные операторы цикла.
 */