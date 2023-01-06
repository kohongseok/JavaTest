package Chap12_1;

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
        // dog.bark();

        // 자식 타입에 부모 객체 대입
        // Dove dove = new Animal();
        // dove.fly();
    }
}