package Chap09_1;

class Time2 {
    boolean am;
    int hour;
    int minute;
    int second;

    Time2(boolean am, int hour, int minute, int second) {
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    Time2(boolean am, int hour, int minute) {
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    Time2(int hour24, int minute) {
        this.am = hour24 < 12;
        this.hour = hour24 % 12;
        this.minute = minute;
        this.second = 0;
    }

    void whatTime() {
        System.out.print(am ? "오전 ":"오후 ");
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}

class ctorover {
    public static void main(String[] args) {
        Time2 now = new Time2(true, 12, 34);
        now.whatTime();
        Time2 today = new Time2(18, 30);
        today.whatTime();
    }
}