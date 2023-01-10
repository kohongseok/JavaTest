package Chap12_2;
class Transport {
    void ride() {
        System.out.print("이동한다");
    }
}

class Bike extends Transport {
    void ride() {
        System.out.print("따르릉 따르릉");
    }
}

class AutoBike extends Transport {
    void ride() {
        System.out.print("빠라바라 빠라밤");
    }

    void bikeshow() {
        System.out.println("앞 바퀴 들고 부르릉...");
    }
}

class SkyKongKong extends Transport {
    void ride() {
        System.out.print("콩콩콩콩");
    }

    void rotate() {
        System.out.println("공중 회전 묘기");
    }
}

class DeliveryMan {
    void delivery(Transport tran, String food) {
        tran.ride();
        System.out.println(" 타고 가서 " + food + "를 배달합니다.");


    }

}

public class delivery {
    public static void main(String[] args) {
        DeliveryMan kim = new DeliveryMan();
        kim.delivery(new Bike(),"짜장면");
        kim.delivery(new AutoBike(),"피자");
        kim.delivery(new SkyKongKong(),"햄버거");

    }
}
