package lr7.Example2;

public class SuperClass {

    private String str;


    SuperClass(String str){
        this.str = str;
    }

    public void setValue(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
    public void setConstValue(){
        this.str = "Const";
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "str='" + str + '\'' +
                " length=" + getLength() +
                '}';
    }
    public int getLength(){
        if(null == this.str){
            return 0;
        }
        return this.str.length();
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