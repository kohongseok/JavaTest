package Chap09_2;


class Car {
    String name;
    boolean gasoline;

    Car() {
    }

    Car(String name, boolean gasoline) {
        this.name = name;
        this.gasoline = gasoline;
    }

    void run() {
        if (gasoline) {
            System.out.println("부릉 부릉");
        } else {
            System.out.println("덜컹 덜컹");
        }
    }

    void stop() {
        System.out.println("끼이익");
    }
}

class JavaTest {
    public static void main(String[] args) {
        Car sonata = new Car("소나타", true);
        sonata.run();

        Car korando = new Car();
        korando.name = "코란도C";
        korando.gasoline = false;
        korando.run();
    }
}