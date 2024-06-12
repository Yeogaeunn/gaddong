public class ControllerTest {
    public static void main(String[] args) {
        Controller[] c = {new TV(false),new Radio(true)};

        for (Controller controller : c)
            controller.show();
    }
}

abstract class Controller{
    boolean power;

    public Controller(boolean power) {
        this.power = power;
    }

    void show(){
        if (power == true)
            System.out.println(getName() + "가 켜졌습니다.");
        else
            System.out.println(getName()+"가 꺼졌습니다.");
    }
    abstract String getName();
}

class TV extends Controller{
    public TV(boolean power) {
        super(power);
    }

    @Override
    String getName() {
        return "TV";
    }
}

class Radio extends Controller{
    public Radio(boolean power) {
        super(power);
    }

    @Override
    String getName() {
        return "Radio";
    }
}
[출처] [6,7장] 쉽게 배우는 자바 프로그래밍 - 도전과제 & 프로그래밍 문제|작성자 박예림
