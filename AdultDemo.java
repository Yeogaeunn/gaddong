3장 프로그래밍문제 p.122

package week3javaproject;

import java.util.Scanner;

public class AdultDemo {
	public static void main(String[] args) {
		System.out.print("몇 살인가요?: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		if (n >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");
	}

}
