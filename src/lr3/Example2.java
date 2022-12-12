package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String weekday = in.nextLine();

        System.out.println("switch: ");

        switch (weekday){
            case "понедельник":
                System.out.println("1 день недели");
                break;
            case "вторник":
                System.out.println("2 день недели");
                break;
            case "среда":
                System.out.println("3 день недели");
                break;
            case "четверг":
                System.out.println("4 день недели");
                break;
            case "пятница":
                System.out.println("5 день недели");
                break;
            case "суббота":
                System.out.println("6 день недели");
                break;
            case "воскресенье":
                System.out.println("7 день недели");
                break;
            default:
                System.out.println("Нет такого дня недели");
        }

        System.out.println("if: ");

        if (weekday.equals("понедельник")){
            System.out.println("1 день недели");
        } else if (weekday.equals("вторник")){
            System.out.println("2 день недели");
        } else if (weekday.equals("среда")){
            System.out.println("3 день недели");
        } else if (weekday.equals("четверг")){
            System.out.println("4 день недели");
        } else if (weekday.equals("пятница")){
            System.out.println("5 день недели");
        } else if (weekday.equals("суббота")){
            System.out.println("6 день недели");
        } else if (weekday.equals("воскресенье")){
            System.out.println("7 день недели");
        } else {
            System.out.println("Нет такого дня недели");
            in.close();
        }

    }
}
/*
2. Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch.
 */