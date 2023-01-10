class Animal {
    void move() { System.out.println("왔다리 갔다리"); }
}

class Dog extends Animal {
    void bark() { System.out.println("멍멍멍"); }
}

class Dove extends Animal {
    void fly() { System.out.println("퍼득 퍼득"); }
}

class JavaTest {
    public static void main(String[] args) {
        // 좌우의 타입이 맞는 경우
        Animal animal = new Animal();
        animal.move();

        // 부모 타입에 자식 객체 대입
        Animal dog = new Dog();
        dog.move();
        ((Dog) dog).bark(); // 이렇게 다운캐스팅(후손타입으로 변경) 하는 것은 가능한다. 다만 위험가능
        ((Animal) dog).move();// 업캐스팅, move()만 호출이 가능하다. 업캐스팅은 굳이 이렇게 할필요없다.


        // 자식 타입에 부모 객체 대입
        //Dove dove = new Animal();
        //dove.fly();
    }
}