package lr3;

import java.util.Scanner;
import java.util.Random;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ввведите количество чисел в сумме: ");
        int x = in.nextInt();
        CalcNums.WhileCalcNums(x);
        CalcNums.ForCalcNums(x);
    }
    private static class CalcNums {
        private static void WhileCalcNums(int x) {
            System.out.println("Цикл while: ");
            int sum = 0;
            Random random = new Random();
            int x1 = x;
            while (x1 > 0) {
                int nums = random.nextInt(100);
                if (nums % 5 == 2 || nums % 3 == 1) {
                    System.out.printf("%d, ", nums);
                    sum += nums;
                    x1--;
                }
            }
            System.out.printf(" = сумма чисел: %d", sum);
        }

        private static void ForCalcNums(int x) {
            System.out.println("\nЦикл for: ");
            int sum = 0;
            for (int i = 0; x > 0; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.printf("%d, ", i);
                    sum += i;
                    x--;
                }
            }
            System.out.printf(" = сумма чисел: %d", sum);
        }
    }
}
/*
5. Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла.

 */
