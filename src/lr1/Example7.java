package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your age: ");
        int age = in.nextInt();

        System.out.println("Your name is " + name);
        System.out.println("You are " + age +  " y.o.");
        in.close();
    }
}
