package lr6.Example10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = get(10, 100, 948, 698);
        System.out.println(Arrays.toString(arr));

    }
        public static int[] get(int ... v){
            Arrays.sort(v);
            int[] arr = new int[2];
            arr[0] = v[0];
            arr[1] = v[v.length - 1];
            return arr;
    }

}
/*
10. Напишите программу со статическим методом, аргументом которому передается
произвольное количество целочисленных аргументов. Результатом метод возвращает
массив из двух элементов: это значения наибольшего и наименьшего значений среди
аргументов, переданных методу.
 */