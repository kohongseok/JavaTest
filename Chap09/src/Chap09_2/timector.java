package Chap09_2;

class Time {
    boolean am;
    int hour;
    int minute;
    int second;

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

class timector {
    public static void main(String[] args) {
        Time now = new Time(true, 12, 34, 56);
        now.whatTime();
    }
}