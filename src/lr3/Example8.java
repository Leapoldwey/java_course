package lr3;

public class Example8 {
    public static void main(String[] args) {
        int arrLength = 10;
        char arr[] = new char[arrLength];
        char firstLetter = 'A';
        char arrHigh[] = {'A', 'E', 'I', 'U', 'Y', 'O'};
        for (int i = 0; i < arr.length; firstLetter++){

            for (int x = 0; x < arrHigh.length; x++){

                if (firstLetter == arrHigh[x]) {

                    firstLetter++;
                }
            }
            arr[i] = firstLetter;
            System.out.println("Результат: " + arr[i]);
            i++;
        }
    }
}
/*
8. Напишите программу, в которой создается символьный массив из
10 элементов. Массив заполнить большими (прописными) буквами
английского алфавита. Буквы берутся подряд, но только согласные (то есть
гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
нужно пропустить). Отобразите содержимое созданного массива в консольном
окне.
 */