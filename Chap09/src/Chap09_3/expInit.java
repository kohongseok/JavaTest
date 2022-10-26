package Chap09_3;

class Time {
    boolean am = true;
    int hour = 12;
    int minute = 0;
    int second = 0;

    Time() { }  // 초기화, 디폴트 생성자는 아무것도 하지 않는다.

    Time(boolean am, int hour, int minute, int secound) {
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = secound;
    }

    void whatTime() {
        System.out.print(am ? "오전 ":"오후 ");
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}

class expInit {
    public static void main(String[] args) {
        Time midnight = new Time();
        midnight.whatTime();

        Time now = new Time(false,3,23,0);
        now.whatTime();
    }
}