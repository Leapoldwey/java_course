package lr6.Example7;

public class Class7 {

    public static void set(char[] ch){
        System.out.println("Целочисленный массив, состоящий из кодов символов:");
        for (int i = 0; i < ch.length; i++){
            System.out.print((int) ch[i] + " ");
        }
    }
}
/*
7. Напишите программу со статическим методом, аргументом которому передастся
символьный массив, а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива- аргумента.
 */