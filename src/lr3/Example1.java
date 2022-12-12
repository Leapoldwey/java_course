package lr3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int num = in.nextInt();

        System.out.println("switch: ");

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
        }
        System.out.println("if: ");

        if (num == 1){
            System.out.println("День недели: понедельник");
        } else if (num == 2){
            System.out.println("День недели: вторник");
        } else if (num == 3){
            System.out.println("День недели: среда");
        } else if (num == 4){
            System.out.println("День недели: четверг");
        } else if (num == 5){
            System.out.println("День недели: пятница");
        } else if (num == 6){
            System.out.println("День недели: суббота");
        } else if (num == 7){
            System.out.println("День недели: воскресенье");
        } else {
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