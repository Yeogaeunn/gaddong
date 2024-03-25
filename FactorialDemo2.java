3장 도전과제 p.118

package javaproject;

import java.util.Scanner;

public class FactorialDemo2 {
	public static void main(String[] args) {
		int n, result;
		Scanner in = new Scanner (System.in);
		System.out.print("팩토리 값을 구할 정수 : ");
		n = in.nextInt();
		
	result = factorial(n);
	System.out.println(result);
	}
	static int factorial (int n) {
		int r = 1;
		while (true) {
			if ( n > 0)
				r *=n--;
			else if (n <= 0)
				break;
		}
		return r;
	}

}
