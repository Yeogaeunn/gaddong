import java.awt.*;

public class TalkableTest {
    static void speak(Talkable o){
        o.talk();
    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}

interface Talkable{
    void talk();
}

class Korean implements Talkable{
    public Korean() {
    }

    @Override
    public void talk() {
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable{
    public American() {
    }

    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}
[출처] [6,7장] 쉽게 배우는 자바 프로그래밍 - 도전과제 & 프로그래밍 문제|작성자 박예림

