package timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int y = in.nextInt();

        int numberOfcans = x + y - 1;
        int hurry = numberOfcans - x;
        int larry = numberOfcans - y;

        out.println(hurry + " " + larry);
        out.flush();

    }
}
