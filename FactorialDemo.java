3장 도전과제 p.119

package javaproject;

public class FactorialDemo3 {
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}
	static int factorial (int n) {
		int r = 1;
		while (true) {
			if (n > 0)
				r *= n--;
			else if (n <= 0)
				break;
		}
		return r;
	}
	
	static int factorial (int n1, int n2) {
		int r = 1;
		while (n1 <= n2)
			r *= n1++;
		return r;
	}

}
