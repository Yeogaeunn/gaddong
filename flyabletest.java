public class FlyableTest {
    public static void main(String[] args) {
        Flyable f = new Flyable() {
            @Override
            public void speed() {
                System.out.println("속도");
            }

            @Override
            public void height() {
                System.out.println("높이");
            }
        };
        f.speed();
        f.height();
    }
}

interface Flyable{
    void speed();
    void height();
}
[출처] [6,7장] 쉽게 배우는 자바 프로그래밍 - 도전과제 & 프로그래밍 문제|작성자 박예림
