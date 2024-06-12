interface Wordable{
    void word();
}

public class WordableTest {

    public static void main(String[] args) {
        Wordable[] m ={
                () -> System.out.println("가위"),
                () -> System.out.println("나비"),
                () -> System.out.println("다리"),
                () -> System.out.println("마차")
        };

        for (Wordable w : m){
            w.word();
        }
    }
}

[출처] 쉽게 배우는 자바 프로그래밍 10장 프로그래밍 문제 2번|작성자 philo

