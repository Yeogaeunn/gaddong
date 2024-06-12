class Dice {
    int roll() {
        return (int) (Math.random() * 6) + 1; // 1부터 6까지의 난수 생성
    }
}
