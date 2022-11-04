package Chap10_3;
class Notebook{
    final String CPU;
    int memory;
    int storage;
    static final long GIGA = 1073741824L;   // 정적상수는 반드시 클래스 선언문에 명시적으로 초기화 해야 함
    // 아래와 같이 복잡하게 초기화 해도 된다.
    /* static final long GIGA;
       static {
        GIGA = 1073741824L;
        }
     */

    Notebook(String CPU, int memory, int storage){
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;


    }
    void upgrade(int memory, int storage){
        this.memory = memory;
        this.storage = storage;

    }

    void printSpec(){
        System.out.println("CPU " + CPU);
        System.out.println("메모리" + memory*GIGA);
        System.out.println("저장곤강" +storage*GIGA);

    }

}
public class Final {
    public static void main(String[] args) {
        Notebook samsung = new Notebook("i7", 16,512);
        Notebook asus = new Notebook("Ryzen5",8,256);

        samsung.printSpec();
        asus.printSpec();

        samsung.upgrade(32,1024);
        samsung.printSpec();

    }
}
