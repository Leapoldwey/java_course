package lr7.Example5;

public class SubClass1 extends SuperClass{

    protected int num;

    SubClass1(String str, int num){
        super(str);
        this.num = num;
    }
    @Override
    public void setInfo(){
        System.out.println("\nClassname: " + this.getClass().getSimpleName() + "\n" +
                " str='" + super.getStr() + '\'' + "\n" +
                " num=" + num);

    }

    @Override
    public String toString() {
        return "Classname:{" + this.getClass().getSimpleName() +
                    " str=" + super.getStr() + "\n" +
                    " num=" + num +
                    '}';
    }
}
/*
5
Напишите программу, в которой есть суперкласс с приватным текстовым полем,
конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля. На основе суперкласса создаются два
подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
защищенное целочисленное поле, там есть конструктор с двумя параметрами и
переопределен метод для отображения значений полей объекта и названия класса. Во
втором подклассе появляется защищенное символьное поле, конструктор с двумя
параметрами и переопределен метод, отображающий в консоли название класса и значения
полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
метод через объектную производного класса.
 */