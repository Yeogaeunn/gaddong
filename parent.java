class Parent {
    String name = "영조"; // 부모 클래스의 name 멤버 변수

    // 부모 클래스의 print() 메서드
    void print() {
        System.out.println(name); // 현재 객체의 name 멤버 변수 출력
    }
}

// Child 클래스 정의 (Parent 클래스를 상속받음)
class Child extends Parent {
    String name = "나는 사도세자이다"; // 자식 클래스의 name 멤버 변수

    // 자식 클래스의 print() 메서드 (오버라이딩)
    void print() {
        System.out.println(name); // 현재 객체의 name 멤버 변수 출력
    }
}
