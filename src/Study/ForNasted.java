package Study;

public class ForNasted {
    static void clock() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                INNER:
                for (int second = 0; second < 60; second++) {
                    if (minute < 10 && second < 10) {
                        System.out.println(hour + ":0" + minute + ":0" + second);
                    } else if (minute < 10 && second >= 10) {
                        System.out.println(hour + ":0" + minute + ":" + second);
                    } else if (minute >= 10 && second < 10) {
                        System.out.println(hour + ":" + minute + ":0" + second);
                    } else {
                        System.out.println(hour + ":" + minute + ":" + second);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        clock();
    }
}
