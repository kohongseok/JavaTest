package Chap11_1;

/*
class Human2 {

    int age;
    String name;

    Human2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void intro() {
        System.out.println("안녕, " + age + "살 " + name + "입니다.");
    }
}
 */

class Student2 extends Human2 {
    int stnum;
    String major;

    Student2(int age, String name, int stnum, String major) {
        super(age, name);
        this.stnum = stnum;
        this.major = major;
    }

    void study() {
        System.out.println("하늘천 따지 검을현 누를황");
    }
}

class Soldier extends Human {
    int milnum;

    Soldier(int age, String name, int milnum) {
        super(age, name);
        this.milnum = milnum;
    }

    void fight() {
        System.out.println("따콩 따콩. 앞으로 전진!!");
    }
}

class Thief extends Human {
    String item;
    int star;

    Thief(int age, String name, String item, int star) {
        super(age, name);
        this.item = item;
        this.star = star;
    }

    void steal() {
        System.out.println("살금 살금~~ 후다닥~~");
    }
}

public class multisub {
    public static void main(String[] args) {
        Student2 lee = new Student2(35, "이율곡", 150629, "주자학");
        lee.study();

        Soldier kang = new Soldier(45, "강감찬", 12345);
        kang.fight();

        Thief hong = new Thief(15, "홍길동", "부자집", 2);
        hong.steal();
    }
}
