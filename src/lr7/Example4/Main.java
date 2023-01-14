package lr7.Example4;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Class3 class3 = new Class3('A', "Hello", 18);
        System.out.println(class3);

        Class3 cloneClass3 = (Class3) class3.clone();
        cloneClass3.setValue('B', "Bay", 19);
        System.out.println("clone" + cloneClass3);
        System.out.println(class3 == cloneClass3);

        Class2 class2 = new Class2('C', "Word1");
        System.out.println("\n" + class2);

        Class2 cloneClass2 = (Class2) class2.clone();
        cloneClass2.setValue('D', "Word2");
        System.out.println("clone" + cloneClass2);
        System.out.println(class2 == cloneClass2);

        Class1 class1 = new Class1('I');
        System.out.println("\n" + class1);

        Class1 cloneClass1 = (Class1) class1.clone();
        cloneClass1.setValue('F');
        System.out.println("clone" + cloneClass1);
        System.out.println(class1 == cloneClass1);

    }
}
/*
4. Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии
 */