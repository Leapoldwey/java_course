package lr7.Example2;

public class SubClass extends SuperClass{

    public int num;

    SubClass(String str) {
        super(str);
    }
    SubClass(String str, int num){
        super(str);
        this.num = num;
    }

    @Override
    public String getStr(){
        return super.getStr();
    }

    public void setValue(String str, int num){
        super.setValue(str);
        this.num = num;
    }

    public void setValue(int num){
        this.num = num;
    }

    @Override
    public void setConstValue(){
        super.setConstValue();
    }
    @Override
    public int getLength(){
        return super.getLength();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
/*
2
Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе (суперклассе) должен быть метод для присваивания значения полю с
текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Добавьте метод, который возвращает длину текстовой строки. На
основе суперкласса создается подкласс. В подклассе появляется дополнительное открытое
(публичное) целочисленное поле. В классе должны быть такие версии метода для
присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый).
 */