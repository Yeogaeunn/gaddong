4장 프로그래밍문제 5번

package week4project;
class Line{
	private int 길이;
	
	public Line(int 길이) {
		this.길이 = 길이;
	}
	
	boolean issameLine(Line n) {
		if (n.길이 == 길이)
			return true;
		return false;
	}
}

public class LineTest {
	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);
	}

}
