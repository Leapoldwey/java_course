package lr6.Example8;

public class Class8 {

    public static void set(int[] ints){
        int count = 0;
        for (int i = 1; i <= ints.length; i++){
            count = count + i;
        }
        System.out.println(count / ints.length);
    }
}
/*
8. Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве).
 */