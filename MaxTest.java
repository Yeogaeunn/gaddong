public class MaxTest {

    public static class Max<T>{
        public <T extends String> T max(T a, T b){
            if (a.length() >= b.length()) return a;
            else return b;
        }
        public <T extends Number> T max(T a, T b){
            if (a.doubleValue() >= b.doubleValue()) return a;
            else return b;
        }
    }


    public static void main(String[] args) {
        Max<Number> n = new Max<>();
        System.out.println(n.max(10.0, 8.0));
        System.out.println(n.max(5, 8.0));

        Max<String> s = new Max<>();
        System.out.println(s.max("Hello", "Hi"));
        System.out.println(s.max("Good", "morning"));

    }

}

[출처] 쉽게 배우는 자바 프로그래밍 9장 프로그래밍 문제 6번|작성자 philo

