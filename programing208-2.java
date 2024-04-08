5장 프로그래밍문제 3번

public class fiveThree {
    public static void main(String[] args) {
        for (Direction d : Direction.values())
            System.out.print(d + " ");
    }
}

enum Direction {
    동, 서, 남, 북;
}
