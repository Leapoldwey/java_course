package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        int num3 = num + num2;
        int num4 = num - num2;
        System.out.printf("Сумма чисел: %d \nРазность чисел: %d\n", num3, num4);
        in.close();
    }
}
