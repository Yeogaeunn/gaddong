5장 프로그래밍문제 8번

import java.util.Scanner;

public class num08 {

	public static void main(String[] args) {
		String s;
		String r;

		Scanner in = new Scanner(System.in);
		s = in.next();
		r = s.toUpperCase();

		System.out.print(Days.valueOf(r) + "은 ");
		printDays(r);

	}

	public static void printDays(String s) {
		String d = Days.valueOf(s).toString();
		switch (d) {
		case "월요일" -> System.out.println("싫다");
		case "금요일" -> System.out.println("좋다");
		case "토요일", "일요일" -> System.out.println("최고");
		default -> System.out.println("그저 그렇다");
		}
	}

	enum Days {
		MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일"), SUNDAY("일요일");

		private String s;

		Days(String s) {
			this.s = s;
		}

		public String toString() {
			return s;
		}
	}
}
