package Study;

public class Lesson3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = a-- - --a + ++a + a++ + a;
        int d = ++b - b++ + ++b - --b;

        System.out.println(c);
        System.out.println(d);

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);

    }
}
