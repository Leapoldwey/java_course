package lr5.Example1.Example3;

public class Class3 {

    private int num1;
    private int num2;

    public Class3(){
        System.out.println("Без аргументов");
    }

    public Class3(int num1){
        this.num1 = num1;
        System.out.println("Один аргумент: " + num1);
    }

    public Class3(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Два аргумента: " + num1 + ", " + num2);
    }
}
/*
3. Напишите программу с классом, у которого есть два целочисленных поля.
В классе должны быть описаны конструкторы, позволяющие создавать
объекты без передачи аргументов, с передачей одного аргумента и с передачей
двух аргументов.
 */