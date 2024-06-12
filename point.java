class Point {
    private int x, y;

    // x 좌표 반환 메서드
    int getPointX() {
        return x;
    }

    // y 좌표 반환 메서드
    int getPointY() {
        return y;
    }

    // Point 클래스의 생성자
    Point(int x, int y) {
        this.x = x; // x 좌표 초기화
        this.y = y; // y 좌표 초기화
    }

    // 객체 정보를 문자열로 반환하는 메서드
    public String toString() {
        return "x 좌표 : " + x + ", y 자표 : " + y + "\n";
    }
}

// MovablePoint 클래스 정의 (Point 클래스를 상속받음)
class MovablePoint extends Point {
    private int xSpeed, ySpeed;

    // MovablePoint 클래스의 생성자
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y); // 부모 클래스의 생성자 호출하여 x, y 좌표 초기화
        this.xSpeed = xSpeed; // x 이동 속도 초기화
        this.ySpeed = ySpeed; // y 이동 속도 초기화
    }

    // 객체 정보를 문자열로 반환하는 메서드 (오버라이딩)
    public String toString() {
        return "x 좌표 : " + getPointX() + ", y 자표 : " + getPointY() +
                ", x 이동속도 : " + xSpeed + ", y 이동속도 : " + ySpeed;
    }
}
