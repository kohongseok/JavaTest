package Chap10_2;

class Bus {
    static Station[] arInfo;
    /* 아래에 버스 요금같은경우는 클래스에 정적상수필드로 선언하고 초기화 해두는것이 좋음
    P.283참고
    final static int BASIC_FARE = 500;

         */
    static {    // 정적 초기화 블록
        arInfo = new Station[7];
        arInfo[0] = new Station("경희대학교", 0, 0);
        arInfo[1] = new Station("청량리", 4, 200);
        arInfo[2] = new Station("제기동", 7, 100);
        arInfo[3] = new Station("답십리", 12, 200);
        arInfo[4] = new Station("금호동", 16, 200);
        arInfo[5] = new Station("옥수", 18, 150);
        arInfo[6] = new Station("압구정", 23, 300);


    }

    void printFare(int from, int to) {
        int fare = 500;
        // int fare = BASIC_FARE;  --> 이렇게 하는 것을 권고함.

        for (int i = from; i < to; i++) {
            fare+=arInfo[i].fare;
        }
        System.out.println(arInfo[from].name+"~"+arInfo[to].name+"까지의 요금은:"+fare+"원 입니다");

    }
}

//station info
class Station{
    String name;
    int distance;
    int fare;

    Station(String name, int distance, int fare){
        this.name = name;
        this.distance = distance;
        this.fare = fare;
    }
}
public class StaticInitBlock {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.printFare(1,5);

        Bus bus2 = new Bus();
        bus2.printFare(2,4);
    }

}
