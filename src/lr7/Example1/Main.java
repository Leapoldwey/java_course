package lr7.Example1;

public class Main {
    public static void main(String[] args) {

        SuperClass superClass = new SuperClass("передал в конструктор суперкласса");
        String className = superClass.toString();
        System.out.println(className);

        SubClass subClass = new SubClass("передал в конструктор подкласса");
        String subClassName = subClass.toString();
        System.out.println(subClassName);

        SubClass subClass2 = new SubClass("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClass2.toString();
        System.out.println(subClassName2);


    }
}
/*
1. Напишите программу, в которой есть суперкласс с приватным текстовым полем,
конструктором с текстовым параметром и где переопределен метод toString (). На основе
суперкласса путем наследования создается подкласс. У него появляется еще одно
приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
В обоих классах метод toString () переопределяется так, что он возвращает строку с
названием класса и значение текстового поля или текстовых полей.
 */