package lr5.Example1.Example5;

public class Main {
    public static void main(String[] args) {

        Class5 test = new Class5(122);
        System.out.println("Присваивание через конструктор > 100: " + test.print());

        Class5 test1 = new Class5(25);
        System.out.println("Присваивание через конструктор < 100: " + test1.print());

        test1.setNum(10);
        System.out.println("Поле < 100: " + test1.print());

        test1.setNum(500);
        System.out.println("Поле > 100: " + test1.print());

        test1.setNum();
        System.out.println("Поле без аргументов: " + test1.print());

    }
}
/*
5. Напишите программу с классом, у которого есть закрытое целочисленное
поле. Значение полю присваивается с помощью открытого метода. Методу
аргументом может передаваться целое число, а также метод может вызываться
без аргументов. Если методы вызывается без аргументов, то поле получает
нулевое значение. Если метод вызывается с целочисленным аргументом, то
это значение присваивается полю. Однако если переданное аргументом
методу значение превышает 100, то значением полю присваивается число 100.
Предусмотрите в классе конструктор, который работает по тому же принципу
что и метод для присваивания значения полю. Также в классе должен быть
метод, позволяющий проверить значение поля.

 */