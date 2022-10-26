package Chap09_3;

class Time2 {
    boolean am;
    int hour;
    int minute;
    int second;

    //초기화 블록
    {
        java.time.LocalTime now = java.time.LocalTime.now();
        hour = now.getHour();
        if (hour>=12) {
            hour-=12;
            am =false;

        }else {
            am = true;
        }

        minute = now.getMinute();
        second = now.getSecond();
    }

    void whatTime(){
        System.out.print(am ? "오전":"오후");
        System.out.println(hour+"시"+minute+"분"+second+"초");

    }
}

public class initBlock {
    public static void main(String[] args) {

        Time2 now = new Time2();
        now.whatTime();
    }
}
