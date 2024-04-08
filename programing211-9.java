5장 프로그래밍문제 9번

import java.util.Scanner;

public class num09 {

	public static void main(String[] args) {
		int m, n;
		float p;
		int[][] random;
		int[][] result;
		String[][] bombs;

		Scanner in = new Scanner(System.in);

		m = in.nextInt();
		n = in.nextInt();
		p = in.nextFloat();

		random = new int[m][n];
		result = new int[m][n];
		bombs = new String[m][n];
		p = p * 100;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int num = (int) (Math.random() * 100);
				random[i][j] = num;
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (random[i][j] < p) {
					bombs[i][j] = "*";
				} else {
					bombs[i][j] = "-";
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = bfs(i, j, bombs);
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(random[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (result[i][j] == 0) {
					System.out.print("* ");
				} else {
					System.out.print(result[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	static int bfs(int i, int j, String[][] arg) {
		int m = arg.length;
		int n = arg[0].length;
		int cnt = 0;
	}
}

