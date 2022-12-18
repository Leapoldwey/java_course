package lr4;

public class Example2 {
    public static void main(String[] args) {

        int numberString = 9;
        int z = 0;
        for (int i = 1; i <= numberString; i++) {
            System.out.print("Номер строки: " + i + " ");
            for (int j = 0; j <= z; j++) {
                System.out.print("-");
            }
            z = z + 1;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
/*
2. Напишите программу, которая выводит в консольное окно
прямоугольный треугольник;
 */