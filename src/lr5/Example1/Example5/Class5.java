package lr5.Example1.Example5;

public class Class5 {
    private int num;

    public Class5(int num) {
        if (num > 100){
            num = 100;
        }
        this.num = num;
    }

    public void setNum(int num) {
        if (num > 100){
            num = 100;
        }
        this.num = num;
    }
    public void setNum(){
        num = 0;
    }

    public int print(){
        return num;
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