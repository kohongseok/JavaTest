package Chap11_2;

class Notebook{
    final String CPU;
    int memory;
    int storage;
    Notebook(String CPU, int memory, int storage) {
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
    }

    void printSpec() {
        System.out.println("CPU=" + CPU);
        System.out.println("Memory" + memory);
        System.out.println("HDD" + storage);

    }
}


/*
class  Human3 {
    int age;
    String name;
    Notebook book;

    Human3(int age, String name, String CPU, int memory, int storage){
        book = new Notebook(CPU, memory,storage);
        this.age = age;
        this.name = name;
    }
    */

class Human3 extends Notebook {
    int age;
    String name;

    Human3(int age,String name, String CPU, int memory, int storage){
        super(CPU,memory,storage);
        this.age = age;
        this.name = name;
    }

    void intro() {
        System.out.println("안녕" +age+"살"+name);
        System.out.println("나의 노트북");
          //book.printSpec();
        printSpec();
    }
}
public class Contain {
    public static void main(String[] args) {
        Human3 kim = new Human3(39, "홍길동", "i7", 9, 3000);
        kim.intro();
    }
}

