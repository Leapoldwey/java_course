package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер месяца: ");
        int numberMonth = in.nextInt();
        if (numberMonth == 1){
            System.out.println("Январь содержит 31 день");
        } else if (numberMonth == 2) {
            System.out.println("Февраль содержит 28 дней");
        } else if (numberMonth == 3) {
            System.out.println("Март содержит 31 день");
        } else if (numberMonth == 4) {
            System.out.println("Апрель содержит 30 дней");
        } else if (numberMonth == 5) {
            System.out.println("Май содержит 31 день");
        } else if (numberMonth == 6) {
            System.out.println("Июнь содержит 30 дней");
        } else if (numberMonth == 7) {
            System.out.println("Июль содержит 31 день");
        } else if (numberMonth == 8){
            System.out.println("Август содержит 31 день");
        } else if (numberMonth == 9) {
            System.out.println("Сентябрь содержит 30 дней");
        } else if (numberMonth == 10) {
            System.out.println("Октябрь содержит 31 день");
        } else if (numberMonth == 11) {
            System.out.println("Ноябрь содержит 30 дней");
        } else if (numberMonth == 12) {
            System.out.println("Декабрь содержит 31 день");
        } else {
            System.out.println("Вы ввели что-то не то");
        }
        in.close();
        }
    }
