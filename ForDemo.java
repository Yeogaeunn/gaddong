3장 프로그래밍문제 p.122-(4)

  package week3javaproject;

public class ForDemo {
	public static void main(String[] args) {
		for (int i =1; i < 6; i++) {
			for (int j =1; j <= i; j++) {
			 System.out.print("*");
		}
		System.out.println();
	    }
