package Chap11_1;

class Human{
    int age;
    String name;

    Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    void intro(){
        System.out.println("안녕" + age + "살" + name + "입니다");

    }

}

class Student extends Human{
    int stnum;
    String mager;

    Student(int age, String name, int stnum, String mager){
        super(age, name);
        this.name = name;
        this.mager = mager;

    }
    void study(){
        System.out.println("공부합니다");
    }
}

public class Student_상속 {
    public static void main(String[] args) {
        Human kim = new Human(29,"KIM");
        kim.intro();
        Student lee = new Student(19,"LEE",940034,"Computer Science");
        lee.intro();
        lee.study();

    }
}
