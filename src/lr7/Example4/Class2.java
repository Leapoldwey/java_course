package lr7.Example4;

public class Class2 extends Class1 implements Cloneable{

    public String str;

    public Class2(char ch, String str) {
        super(ch);
        this.str = str;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "ch=" + super.ch + '\'' +
                "str='" + str + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setValue(char ch, String str){
        super.setValue(ch);
        this.str = str;
    }

    public String getStr() {
        return str;
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