package Chap10_2_4;

class Car{
    String name;
    boolean gasoline;
    static int carNum;

    Car(String aName, Boolean aGasoline){
        name = aName;
        gasoline = aGasoline;
        carNum++;
    }

    //정적메소드 선언
    static void restNum(){
        carNum = 0; // 정적변수를 0대로 초기화 하기 위해 사용, carNum은 정적변수이므로 계속 ++ 되기 떄문에
    }

    static void printNum() {
        System.out.println("현재 출고 대수" + carNum);
    }

    void run() {
        if(gasoline) {
            System.out.println("부릉");
        } else {
            System.out.println("덜컹");
        }
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Car.printNum();     // Car 클래스가 생성되지 않아도 printNum()이 정적메서드 이므로 객체가 없어도 바로 호출 가능

        Car pride = new Car("프라이드",true);
        Car korando = new Car("코란도",false);
        Car.printNum();
        Car.restNum();
        Car equs = new Car("Equs",true);
        Car.printNum();
    }
}
