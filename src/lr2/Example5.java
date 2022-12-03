package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        int howManyThousands = (num / 1000)%10;
        System.out.printf("Тысяч в числе: %d", howManyThousands);
        in.close();
    }
}
/*
5. Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра справа в десятичном
представлении числа).
 */
