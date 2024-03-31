4장 프로그래밍문제 7번

package week4project;
class GolfClub{
	private int n = 0;
	private String a;
	
	public GolfClub() {
		n = 7;
	}
	
	public Golfclub(int n) {
		this.n = n;
	}
	
	public GolfClub(String a) {
		if (n > 0)
			System.out.println(n + "번 아이언입니다.");
		else if (!(a.equals("")))
			System.out.println(a + "입니다.");
	}

}

public class GolfClubTest {
	public static void main(String[] args) {
		GolfClub g1 = new GolfClub();
		g1.print();
		GolfClub g2 = new Golfclub(8);
		g2.print();
		GolfClub g3 = new GolfClub("퍼터");
		g3.print();
	}

}
