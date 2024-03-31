4장 프로그래밍문제 8번

package week4project;
class Dice{
	private double face;
	
	public Dice() {
	}
	
	public int roll() {
		face = (int) (Math.random()*6)+1;
		return (int) face;
	}
}

public class DiceTest {
	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("주사위의 숫자: " + d.roll());
	}

}
