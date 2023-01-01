package timus.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();

        int remains = 0;

        for (int i = 0; i < n; i++){
            int x = in.nextInt();
            remains = remains + x - k;
            if (remains < 0){
                remains = 0;
            }
        }
        System.out.println(remains);

    }
}
