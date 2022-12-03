package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        if (num == 0) {
            System.out.println("Error");
        } else {
            int result = num % 5;
            int result2 = num % 7;
            System.out.println("Результат остатка при делении на 5: " + result);
            System.out.println("Результат остатка при делении на 7: " + result2 + "\n");
            if (result == 2) {
                System.out.println("Число делится на 5 с остатком 2");
            } else {
                System.out.println("Число не делится на 5 c остатком 2");
            }if (result2 == 1) {
                System.out.println("Число делится на 7 с остатком 1");
            } else {
                System.out.println("Число не делится на 7 c остатком 1");
            }
        }in.close();
    }
}
/*
2. Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: при делении на 5 в остатке
получается 2, а при делении на 7 в остатке получается 1.
 */