4장 프로그래밍문제 1번

package week4project;
class Triangle {
	private double a;
	private double b;
	
	public Triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double findArea() {
		return 1.0/2.0 * a * b;
	}
}

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}

}
