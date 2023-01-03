package lr6.Example9;

public class Class9 {

    public static void set(char[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = arr.length - 1; j >= 0; j--){
            System.out.print(j + " ");
        }
    }
}
/*
9. Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив. В результате вызова метода элементы массива попарно
меняются местами: первый — с последним, второй — с предпоследним и так далее.
 */