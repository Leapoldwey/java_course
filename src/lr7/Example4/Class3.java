package lr7.Example4;

public class Class3 extends Class2 implements Cloneable {

    public int num;

    Class3(char ch, String str, int num){
        super(ch, str);
        this.num = num;
    }

    @Override
    public String toString() {
        return "Class3{" +
                "ch=" + super.ch +
                ", str='" + super.str + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setValue(char ch, String str, int num){
        super.setValue(ch, str);
        this.num = num;
    }

    public char getCh() {
        return super.ch;
    }

    public String getStr() {
        return super.str;
    }

    public int getNum() {
        return num;
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