package lr6.Example5;

public class Class5 {

    public static void set(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result = result + (int) Math.pow(i, 2);
        }
        System.out.println(result);
    }
}
/*
5. Напишите программу со статическим методом, которым вычисляется сумма
квадратов натуральных чисел 1^2 + 2^2 + 3^2 + ... + п^2
. Число п передается аргументом методу.
Для проверки результата можно использовать формулу 1^2 + 2^2 +3^2+…+n^2=(n+l) (2n + 1)/6
 */