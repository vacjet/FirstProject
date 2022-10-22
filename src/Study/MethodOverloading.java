package Study;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(sum1());
        System.out.println(sum1(1));
        System.out.println(sum1(1, 1));
        System.out.println(sum1(1, 1, 1));
        System.out.println(sum1(1, 1, 1, 1));
        System.out.println(sum1(1, 1, 1, 1, 1));
    }

    static int sum1() {
        return 0;
    }

    static int sum1(int a1) {
        return a1;
    }

    static int sum1(int a2, int b2) {
        return a2 + b2;
    }

    static int sum1(int a3, int b3, int c3) {
        return a3 + b3 + c3;
    }

    static int sum1(int a4, int b4, int c4, int d4) {
        return a4 + b4 + c4 + d4;
    }

    static int sum1(int a5, int b5, int c5, int d5, int e5) {
        return a5 + b5 + c5 + d5 + e5;
    }
}
