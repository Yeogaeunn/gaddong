Circle.java
public class Circle {
    public int radius;

    public void show() {
        System.out.println("반지름이 " + radius + "인 원이다.");
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}

ColoredCircle.java
public class ColoredCircle extends Circle{
    public String color;
    public void show(){
        System.out.println("반지름이 "+radius+"인 "+color+" 원이다.");
    }
    public ColoredCircle(int radius, String color){
        super(radius);
        this.color = color;
    }
}

ch06.java
public class ch06 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        ColoredCircle c2 = new ColoredCircle(10, "빨간색");

        c1.show();
        c2.show();
    }
}

