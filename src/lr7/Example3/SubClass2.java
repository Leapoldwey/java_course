package lr7.Example3;

public class SubClass2 extends SubClass {

    public String str;

    SubClass2(){

    }

    SubClass2(int num, char ch, String str){
        super(num, ch);
        this.str = str;
    }

    public void setValues(int num, char ch, String str){
        super.setValues(ch, num);
        this.str = str;
    }

    @Override
    public String toString(){
        String classNameAndValues;
        classNameAndValues = "SubClass2" + "\n" +
                " Class name: " + getClass().getSimpleName() + "\n" +
                " int = " + super.num + "\n" +
                " char = " + this.ch + "\n" +
                " String = " + this.str + "\n";
        return classNameAndValues;
    }
}
/*
3. Напишите программу, в которой на основе суперкласса создается подкласс, а на
основе этого подкласса создается еще один подкласс (цепочка наследования из трех
классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
параметром для присваивания значения полю и конструктор с одним параметром. Во
втором классе появляется открытое символьное поле, метод с двумя параметрами для
присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта
 */