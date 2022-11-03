package Chap10_2;

class Car{
    String name;
    boolean gasoline;
    static int carNum = 1000;

    Car(String aName, boolean aGasoline){
        name = aName;
        gasoline = aGasoline;
        carNum++;
    }
}

public class CarNumStatic {
    public static void main(String[] args) {
        System.out.println("생성전:"+Car.carNum);
        Car korando = new Car("코란도",false);
        System.out.println(korando.name + ":"+korando.carNum);

        Car equs = new Car("에쿠스",true);
        System.out.println(equs.name + ":"+equs.carNum);
    }
}
