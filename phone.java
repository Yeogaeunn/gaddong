public Phone(String owner) {
    this.owner = owner;
}

// Telephone 클래스의 생성자. owner와 when을 매개변수로 받아서 부모 클래스의 생성자를 호출하여 owner를 초기화하고, 자식 클래스의 when을 초기화한다.
public Telephone(String owner, String when) {
    super(owner); // 부모 클래스인 Phone 클래스의 생성자 호출
    this.when = when;
}

// Telephone 클래스의 생성자. owner를 매개변수로 받아서 부모 클래스의 생성자를 호출하여 owner를 초기화한다.
public Telephone(String owner) {
    super(owner); // 부모 클래스인 Phone 클래스의 생성자 호출
}

// Smartphone 클래스의 생성자. owner와 game을 매개변수로 받아서 부모 클래스의 생성자를 호출하여 owner를 초기화하고, 자식 클래스의 game을 초기화한다.
public Smartphone(String owner, String game) {
    super(owner); // 부모 클래스인 Phone 클래스의 생성자 호출
    this.game = game;
}

// Smartphone 클래스의 생성자. owner, when, game을 매개변수로 받아서 부모 클래스의 생성자를 호출하여 owner와 when을 초기화하고, 자식 클래스의 game을 초기화한다.
public Smartphone(String owner, String when, String game) {
    super(owner, when); // 부모 클래스인 Telephone 클래스의 생성자 호출
    this.game = game;
}
