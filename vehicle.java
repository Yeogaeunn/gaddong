Vehicle.java
public class Vehicle {

    public String color;
    public int speed;

    public Vehicle(String color, int speed){
        this.color = color;
        this.speed = speed;
    }

    public void show(){
        System.out.println("color : " + this.color);
        System.out.println("speed : " + this.speed);
    }

}

Car.java
public class Car extends Vehicle{

    public int displacement;
    public int gears;

    public Car(String color, int speed, int displacement, int gears){
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }

    public void show(){
        System.out.println("color : " + this.color);
        System.out.println("speed : " + this.speed);
        System.out.println("displacement : " + this.displacement);
        System.out.println("gears : " + this.gears);
    }
}

OverrideTest.java
public class OverrideTest {
    public static void main(String[] args) {
        Car c = new Car("파랑", 200, 1000, 5);
        c.show();

        System.out.println();
        Vehicle v = c;
        v.show();
    }
}
