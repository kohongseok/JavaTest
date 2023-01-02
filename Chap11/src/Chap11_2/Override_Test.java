package Chap11_2;

class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void intro() {
        System.out.println("안녕" + age + "살" + name + "입니다");
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

    void intro() {  // 오버라이딩
        System.out.println(major + "학과 " + stnum + "학번 " + name + "입니다.");
    }

    void study(){
        System.out.println("공부합니다");
    }
}

public class Override_Test {
    public static void main(String[] args) {

        Human kim = new Human(29,"홍길동");
        kim.intro();
        Student lee = new Student(42,"전지현",999999,"컴공");
        lee.intro();

    }
}
