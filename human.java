interface Human{
    void eat();
    void print();
    static void echo(){
        System.out.println("야호!!!");
    }
}

class Worker implements Human{

    @Override
    public void eat() {
        System.out.println("빵을 먹습니다.");
    }

    @Override
    public void print() {
        System.out.println("인간입니다.");
    }
}

class Student implements Human{
    int age;

    public Student(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }

    @Override
    public void print() {
        System.out.println(age + "세의 학생입니다.");
    }
}

public class HumanTest {
    public static void main(String[] args) {
        Human.echo();

        Student s = new Student(20);
        s.print();
        s.eat();

        Human p = new Worker();
        p.print();
        p.eat();
    }
}
[출처] [6,7장] 쉽게 배우는 자바 프로그래밍 - 도전과제 & 프로그래밍 문제|작성자 박예림
