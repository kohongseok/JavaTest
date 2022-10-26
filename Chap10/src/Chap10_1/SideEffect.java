package Chap10_1;
class Range {
    private int from;
    private int to;

    Range(int from, int to) {
        setFrom(from);
        setTo(to);
    }

    public int getFrom() { return from; }

    public void setFrom(int from) {
        this.from = from;
        if (to < from) {
            to = from;
        }
    }

    public int getTo() { return to; }

    public void setTo(int to) {
        this.to = to;
        if (from > to) {
            from = to;
        }
    }

    public void outRange() {
        System.out.println(from + " ~ " + to);
    }
}

public class SideEffect {
    public static void main(String[] args) {
        Range range = new Range(2,6);
        range.outRange();
        range.setFrom(8);
        range.setTo(10);
        range.outRange();
    }
}
