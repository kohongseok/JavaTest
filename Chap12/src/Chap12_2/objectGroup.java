package Chap12_2;
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

class Soldier extends Human{
    int milNum;

    Soldier(int age, String name, int minNum) {
        super(age, name);
        this.milNum = minNum;
    }

    void intro() {
        System.out.println("군인 , 군번 " + milNum);
    }
}

class Thief extends Human{
    String item;
    int star;

    Thief(int age, String name, String item, int star) {
        super(age,name);
        this.item = item;
        this.star = star;

    }
    void intro() {
        System.out.println(item + " 털이 전문 도둑 " + star + "범");

    }
}
// 추가 클래스
class Graduate extends Student {
   String thesis;
    Graduate(int age, String name, int stnum, String major, String thesis) {
        super(age, name, stnum, major);
        this.thesis = thesis;

    }
    void intro() {
        System.out.println(thesis + "논문을 쓰고 있는 대학원생입니다.");

    }
}
public class objectGroup {
    public static void main(String[] args) {
        Human[] arHuman = {
                new Human(29, "김상형"),
                new Student(42, "이승우", 9312345, "경영"),
                new Soldier(45, "강감찬", 12345),
                new Thief(15, "홍길동", "부자집", 2),
                new Graduate(35,"박대기",940034,"컴공","웹보안에 관한 연구"),

        };

        dumpGroupHuman(arHuman);
    }
    static void dumpGroupHuman(Human[] group) {
        for (Human h : group) {
            h.intro();
        }
    }
}
