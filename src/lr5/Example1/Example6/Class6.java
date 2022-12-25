package lr5.Example1.Example6;

public class Class6 {

    private int min;
    private int max;


    public void set(int minNum, int maxNum) {
        min = Math.min(minNum, maxNum);
        max = Math.max(minNum, maxNum);
        System.out.println("Два аргумента: ");
    }

    public void set(int num) {
        this.min = num;
        this.max = num;
        System.out.println("Один аргумент: ");
        ;
    }

    public void printNum() {
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    public Class6(int minNum, int maxNum) {
        min = Math.min(minNum, maxNum);
        max = Math.max(minNum, maxNum);
        System.out.println("Конструктор два аргумента: ");
    }

    public Class6(int num){
        this.min = num;
        this.max = num;
        System.out.println("Конструктор один аргумент: ");
    }
}

/*
6. Напишите программу с классом, в котором есть два закрытых
целочисленных поля (назовем их max и min). Значение поля max не может
быть меньше значения поля min. Значения полям присваиваются с помощью
открытого метода. Метод может вызываться с одним или двумя
целочисленными аргументами. При вызове метода значения полям
присваиваются так: сравниваются текущие значения полей и значения
аргументов, переданных методу. Самое большое из значений присваивается
полю max, а самое маленькое из значений присваивается полю min.
Предусмотрите конструктор, который работает по тому же принципу, что и
метод для присваивания значений полям. В классе также должен быть метод,
отображающий в консольном окне значения полей объекта.
 */