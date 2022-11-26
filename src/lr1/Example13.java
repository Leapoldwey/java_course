package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num1 = in.nextInt();
        System.out.println("Enter another number: ");
        int num2 = num1 + in.nextInt();
        System.out.println("The number is equal to: " + num2);
        in.close();
    }
}
