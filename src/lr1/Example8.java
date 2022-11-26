package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");
        String day = in.nextLine();

        System.out.println("Enter the month: ");
        String month = in.nextLine();

        System.out.println("Enter the date: ");
        int date = in.nextInt();

        System.out.printf("Today is: %s %s %d \n", day, month, date);
        in.close();
    }
}
