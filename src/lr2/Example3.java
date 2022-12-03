package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num >= 10){
            int result = num % 4;
            if (result == 0) {
                System.out.printf("Число %d делится на 4 и оно больше 10", num);
            }else {
                System.out.println("Число не делится на 4");
            }
        }else {
            System.out.println("Число меньше 10");
        }in.close();
    }
}
/*
3. Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: число делится на 4, и при
этом оно не меньше 10.
 */