package lr4;


import java.util.Random;

public class Example3 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomLength = random.nextInt(2,9);
        int randomHeight = random.nextInt(15);

        int count = 0;
        int x = 0;

        int arr[][] = new int[randomLength][randomHeight];

        for (int i = 0; i < randomLength; i++){
            x += 1;
            System.out.print("Номер строки: " + x + "  ");
            for (int j = 0; j < randomHeight; j++){
                arr[i][j] = 2;
                count += 1;
                System.out.print(arr[i][j]);
            }
            System.out.println(" количество символов в строке: " + count);
            count = 0;
        }

    }
}
/*
3. Напишите программу, в которой создается двумерный массив, который
выводи прямоугольник из цифр 2;
 */