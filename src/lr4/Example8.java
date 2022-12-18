package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите слово для шифрования: ");
        String word = in.nextLine();
        System.out.print("Введите ключ: ");
        int key = in.nextInt();

        System.out.printf("Слово \"%s\" до шифрования на ключ равный \"%d\"  \n", word, key);

        char[] chars = word.toCharArray();
        int[] ints = new int[word.length()];

        for (int i = 0; i < word.length(); i++) {
            ints[i] = chars[i] + key;
        }
        System.out.print("\"ints\" после шифрования: " + Arrays.toString(ints));

        for (int j = 0; j < word.length(); j++) {
            chars[j] = (char) ints[j];
        }
        System.out.print("\n\"char\" после шифрования: " + Arrays.toString(chars) + "\n");
        for (int i = 0; i < word.length(); i++) {
            ints[i] = chars[i] - key;
        }
        for (int i = 0; i < word.length(); i++) {
            chars[i] = (char) ints[i];
        }
        System.out.println("Выполнить обратное преобразование? (y/n)");
        boolean x = true;
        while (x){
            String answer = in.next();
            if (answer.equals("y") || answer.equals("Y")) {
                String word2 = new StringBuilder().append("").append(chars).toString();
                System.out.println("Слово до шифрования: " + word2);
                x = false;
        }   else if (answer.equals("n") || answer.equals("N")){
                System.out.println("До свидания!");
                x = false;
        }   else {
                System.out.println("Введите корректный ответ");
                x = true;
            }
        }
        in.close();
    }
}
/*
8. Напишите программу «Шифр Цезаря», которая зашифровывает
введенный текст. Используете кодовую таблицу символов. При запуске
программы в консоль необходимо вывести сообщение: «Введите текст для
шифрования», после ввода текста, появляется сообщение: «Введите ключ».
После того как введены все данные, необходимо вывести преобразованную
строку с сообщением «Текст после преобразования : ». Далее необходимо
задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До
свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
то программа ему выводит сообщение: «Введите корректный ответ».
 */