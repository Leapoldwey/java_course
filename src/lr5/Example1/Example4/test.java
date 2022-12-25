package lr5.Example1.Example4;

public class test {
    public static void main(String[] args) {
        int num;
        char ch;
        double num2 = 65.12;
        double result = (num2 % 1) * 100;
        System.out.println("Число" + (int) result); //int целое число

        double result2 = (char) num2;
        System.out.println("буква" + (char) result2); //char буква

        int numLetter = (int) result2; //int буквы
        System.out.println("номер буквы" + numLetter);
    }
}
