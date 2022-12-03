package lr2;


import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num >= 5 && num <= 10){
            System.out.printf("Число %d попадает в диапазон 5 - 10", num);
        }else {
            System.out.printf("Число %d нарушает условия", num);
        }in.close();
    }
}
/*
4. Напишите программу, которая проверяет, попадает ли введение
пользователем число в диапазон от 5 до 10 включительно.
 */