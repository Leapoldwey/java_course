package lr3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        int arrLength = 10;
        char arr[] = new char[arrLength];
        char firstLetter = 'a';

        for (int i = 0; i < arr.length; i++){
            arr[i] = firstLetter;
            firstLetter += 2;
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
/*
7. Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через
одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
порядке. Размер массива задается переменной.
 */