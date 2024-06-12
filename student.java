class Student {
    String name;

    // Student 클래스 생성자
    public Student(String name) {
        this.name = name; // 이름 초기화
    }

    // toString() 메서드 오버라이딩
    public String toString() {
        // MessageFormat을 사용하여 형식화된 문자열 생성
        String s = MessageFormat.format("학생[{0}]", name);
        return s; // 생성된 문자열 반환
    }
}
