5장 프로그래밍문제 3번

public class num03 {

	public static void main(String[] args) {
		for (Direction d : Direction.values())
			System.out.print(d + " ");
	}

	enum Direction {
		A("동"), B("서"), C("남"), D("북");

		private String s;

		Direction(String s) {
			this.s = s;
		}

		public String toString() {
			return s;
		}
	}
}
