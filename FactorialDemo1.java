3장 도전과제 p.117

package javaproject;

import java.util.Scanner;

public class FactorialDemo1 {
	public static void main(String[] args) {
		int result;
		int n;
		Scanner in = new Scanner (System.in);
		
		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();
		
		result = 1;
		while ( n > 0) {
			result *= n--;
		}
		System.out.println(result);
	}

}
