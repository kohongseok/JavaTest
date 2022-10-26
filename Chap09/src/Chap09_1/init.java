package Chap09_1;

class Car2 {
    String name;
    boolean gasoline;

    Car2(String name, boolean gasoline) {
        init(name, gasoline);
    }

    void init(String name, boolean gasoline) {
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

class init {
    public static void main(String[] args) {
        Car2 korando = new Car2("코란도C", false);
        korando.run();
        korando.stop();

        korando.init("제네시스", true);
        korando.run();
        korando.stop();
    }
}
