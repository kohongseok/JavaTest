package Chap12_1;

class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void intro() {
        System.out.println("안녕, " + age + "살 " + name + "입니다.");
    }
}
class Student extends Human {
    int stnum;
    String major;

    Student(int age, String name, int stnum, String major) {
        super(age, name);
        this.stnum = stnum;
        this.major = major;
    }

    void intro() {
        System.out.println(major + "학과 " + stnum + "학번 " + name + "입니다.");
    }

    void study() {
        System.out.println("하늘천 따지 검을현 누를황");
    }
}

public class dynamic {
    public static void main(String[] args) {
        Human kim = new Human(29, "홍길동");
        Student lee = new Student(22, "Lee", 0000001, "컴공");

        introHuman(kim);
        introHuman(lee);
    }

    static void introHuman(Human who) {
        who.intro();
    }
}
