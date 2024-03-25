3장 프로그래밍문제 p.124-(8)

  package week3javaproject;

public class FactorialTestDemo {
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	static int factorial(int n) {
		return switch(n)
		{
		case 0 -> 1;
		case 1 -> 1;
		default -> factorial(n-1)*n;
		};
	}

}
