package Chap11_1;

class Human2{
    int age;
    String name;

    Human2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Human2(float birth, String name){
        this(0,name);
        java.time.LocalDate now = java.time.LocalDate.now();
        this.age = now.getYear()-(int)birth+1;

    }


    void intro() {
        System.out.println("hi"+age+"살"+name+"입니다");

    }
}

class student extends Human2{
    int stnum;
    String major;
    student(int age, String name, int stnum, String majer) {
        super(age, name);
        this.stnum = stnum;
        this.major= major;
    }
}

public class Super {
    public static void main(String[] args) {
        student kim2 = new student(39,"노정란",9900123,"건축");
        kim2.intro();

    }
}
