package lr3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int num = in.nextInt();
        switch (num) {
            case 1:
                System.out.println("День недели: понедельник");
                break;
            case 2:
                System.out.println("День недели: вторник");
                break;
            case 3:
                System.out.println("День недели: среда");
                break;
            case 4:
                System.out.println("День недели: четверг");
                break;
            case 5:
                System.out.println("День недели: пятница");
                break;
            case 6:
                System.out.println("День недели: суббота");
                break;
            case 7:
                System.out.println("День недели: воскресенье");
                break;
            default:
                System.out.println("Введено некорректное значение");
            in.close();
        }
    }
}
/*
1. Напишите программу, в которой пользователь вводит целое число
в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
Если введенное пользователем число выходит за допустимый диапазон,
выводится сообщение о том, что введено некорректное значение. Используйте
оператор выбора switch.
 */