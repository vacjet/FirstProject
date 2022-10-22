package Study;

/**
 * Написать программу высчитывающую факториал введённого целого числа. 1*2*3*4*5
 */
public class Factorial {
    public static void main(String[] args) {
        int res = fact(5);
        System.out.println(res);
    }

    private static int fact(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
