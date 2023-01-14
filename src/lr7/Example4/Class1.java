package lr7.Example4;

public class Class1 implements Cloneable{

    public char ch;

    Class1(char ch){
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "ch=" + ch +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setValue(char ch){
        this.ch = ch;
    }

    public char getCh() {
        return ch;
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