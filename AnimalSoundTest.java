import java.util.ArrayList;
import java.util.List;

public class AnimalSoundTest {
    static <T extends Animal> void printSound(List<T> a){
        for (T list : a)
            list.sound();
    }
    public static void main(String[] args) {
        List<Animal> lists = new ArrayList<>();
        lists.add(new Dog());
        lists.add(new Cuckoo());
        printSound(lists);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        printSound(dogs);
    }
}

interface Animal{
    void sound();
}

class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("멍멍~~");
    }
}

class Cuckoo implements Animal{

    @Override
    public void sound() {
        System.out.println("뻐꾹뻐꾹~~");
    }
}
[출처] [8장, 9장] 쉽게 배우는 자바 프로그래밍 - 도전과제 & 프로그래밍 문제|작성자 박예림
