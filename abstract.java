abstract class Abstract {
	int i;

	Abstract(int i) {
		this.i = i;
	}

	void show() {
	}

}

class Concrete extends Abstract {
	int j;

	Concrete(int i, int j) {
		super(i);
		this.j = j;

	}

	void show() {
		System.out.println("i = " + i + " " + "j = " + j);

	}

}

public class AbstractTest {

	public static void main(String[] args) {

		Concrete c = new Concrete(100, 50);
		c.show();

	}

}
[출처] [쉽게배우는자바프로그래밍] 7장 프로그래밍 문제|작성자 초록비

