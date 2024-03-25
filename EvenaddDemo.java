3장 프로그래밍문제 p.122-(3)

package week3javaproject;

import java.util.Scanner;

public class EvenaddDemo {
	public static void main(String[] args) {
		int n = 1, sum = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			n = in.nextInt();
			
			if(n % 2==0)
				sum = sum +n;
		} while(n > 0);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
	}

}
