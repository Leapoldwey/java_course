package lr5.Example1;

public class Main {
    public static void main(String[] args) {

        Class1 class1 = new Class1();

        class1.setCh('M');
        System.out.println("codeSymbol: " + class1.getCodeSymbol());

        class1.getSymbolAndHisCode();

    }
}


/*
1. Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код.
 */
