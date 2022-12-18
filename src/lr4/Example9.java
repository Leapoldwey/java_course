package lr4;


import java.util.Scanner;

public class Example9 {
    private static class Caeser2 {
        static char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z'};

        private static String before(String text, int key) {
            char[] arrText = text.toCharArray();
            char[] code = new char[arrText.length];
            for (int i = 0; i < arrText.length; i++) {
                for (int j = 0; j < letters.length; j++) {
                    if (arrText[i] == letters[j]) {
                        code[i] = letters[(j + key) % 26];
                    } else if (code[i] == 0) {
                        code[i] = '*';
                    }
                }

            }
            for (int i = 0; i < arrText.length; i++) {
                arrText[i] = code[i];
            }
            text = new String(arrText);
            return text;
        }

        private static String after(String text, int key) {
            char[] ArrayText = text.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++) {
                for (int j = 0; j < letters.length; j++) {
                    if (ArrayText[i] == letters[j]) {
                        CharCode[i] = letters[(j - key) % 26];
                    } else if (CharCode[i] == '*') {
                        CharCode[i] = '*';
                    }
                }
            }
            for (int i = 0; i < ArrayText.length; i++) {
                ArrayText[i] = (char) CharCode[i];
            }
            text = new String(ArrayText);
            return text;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ: ");
        int shift = in.nextInt();
        String beforeStr = Caeser2.before(text.toLowerCase(), shift);
        System.out.print("Текст после преобразования :" + "\"" + beforeStr + "\"");
        System.out.println("\nВыполнить обратное преобразование? (y/n)");
        boolean x = true;
        while (x) {
            String answer = in.next();
            if (answer.equals("y") || answer.equals("Y")) {
                String decryptStr = Caeser2.after(beforeStr, shift);
                System.out.println(decryptStr);
                x = false;
            }
            else if (answer.equals("n") || answer.equals("N")) {
                System.out.println("До свидания!");
                x = false;
            }
            else {
                System.out.println("Введите корректный ответ: ");
                x = true;
            }
        }
        in.close();
    }
}
