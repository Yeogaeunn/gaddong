public class PairTest {
    public static void main(String[] args) {
        Pair<Integer> p1 = new Pair<>(10,20);
        Pair<Double> p2 = new Pair<>(10.0,20.0);

        System.out.println(p1.first());
        System.out.println(p2.second());
    }
}

class Pair<T>{
    public T num1;
    public T num2;

    public Pair(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    T first(){
        return num1;
    }

    T second(){
        return num2;
    }
}
[출처] [8장, 9장] 쉽게 배우는 자바 프로그래밍 - 도전과제 & 프로그래밍 문제|작성자 박예림
