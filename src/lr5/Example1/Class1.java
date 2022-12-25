package lr5.Example1;

public class Class1 {

    private char ch;

    public void setCh(char ch) {
        this.ch = ch;
    }

    public int getCodeSymbol(){
        return ch;
    }

    public void getSymbolAndHisCode(){
        System.out.println("symbol: " + ch);
        System.out.println("code: " + (int) ch);
    }

}
/*
1. Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код.
 */