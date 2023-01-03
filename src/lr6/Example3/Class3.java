package lr6.Example3;

public class Class3 {

    public static void setArr(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Наименьшее: " +min);
        int max = arr[0];
        for (int j = 0; j < arr.length; j++){
            if (max < arr[j]){
                max = arr[j];
            }
        }
        System.out.println("Наибольшее: " + max);
        int sr1 = 0;
        for (int k = 0; k < arr.length; k++){
            sr1 = (sr1 + arr[k]);
        }
        System.out.println("Среднее: " + sr1 / arr.length);
    }

}
/*
3. Напишите программу с классом, в котором есть статические методы, которым
можно передавать произвольное количество целочисленных аргументов (или
целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
значение из набора чисел.
 */