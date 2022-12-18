package lr4;

public class Example1 {
    public static void main(String[] args) {

        int width = 23;
        int high = 0;
        int count = 0;
        int numberString = 0;
        System.out.println("Прямоугольник размером: ширина - 23, высота - 11");
        while (count < 253){
            if (high == 0){
                numberString += 1;
                if (numberString < 10){ // Когда номер строки < 10 между номером и символом "-" ставится 2 пробела
                    System.out.print("номер строки: " + numberString + "  ");
                }
                if (numberString >= 10){ // Когда номер строки >= 10 между номером и символом "-" ставится 1 пробел
                    // Данное действие проделано для красоты прямоугольника. Если этого не сделать, последние строчки
                    //прямоугольника сдвигаются на 1 символ
                    System.out.print("номер строки: " + numberString + " ");
                }
                for (int i = 0; i < width; i++){
                    high += 1;
                    count += 1;
                    System.out.print("▬");
                } if (high == 23){
                    System.out.print(" количество символов в строке " + high + "\n");
                    high = 0;
                }
            }
        }
    }
}
/*1. Напишите программу, которая выводит в консольное окно
прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11 строк;
 */
