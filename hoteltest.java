public class HotelTest {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.add(5, "호돌이");
        hotel.add(7, "길동이");
        hotel.show();
    }
}

class Hotel{

    class Room{
        String name;
        int number;

        public Room(String name, int number) {
            this.name = name;
            this.number = number;
        }
    }

    Room[] rooms = new Room[10];

    void add(int num, String name){
        rooms[num] = new Room(name, num);
    }

    void show(){
        for (Room a : rooms){
            if (a != null)
                System.out.println(a.number + "번 방을 " + a.name + "이가 예약했습니다.");
        }
    }
}
[출처] [6,7장] 쉽게 배우는 자바 프로그래밍 - 도전과제 & 프로그래밍 문제|작성자 박예림
