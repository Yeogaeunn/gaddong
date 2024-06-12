class Circle {
    int num;

    // Circle 클래스 생성자
    public Circle(int num) {
        this.num = num; // 반지름 초기화
    }

    // hashCode() 메서드 오버라이딩
    public int hashCode() {
        return Objects.hash(num); // num 변수를 기반으로 한 해시코드 생성
    }

    // equals() 메서드 오버라이딩
    public boolean equals(Object obj) {
        if (this == obj) { // 객체 자신과 비교했을 때 같은 객체인지 확인
            return true;
        }
        if (!(obj instanceof Circle)) { // 비교 대상이 Circle 객체인지 확인
            return false;
        }
        Circle configation = (Circle) obj; // 비교 대상을 Circle 객체로 캐스팅
        return num == configation.num; // 반지름이 같은지 여부 반환
    }
} 
