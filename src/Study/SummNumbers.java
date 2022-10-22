package Study;

/**
 * Имеется число. Посчитать сумму цифр данного числа.
 */

public class SummNumbers {
    public static void main(String[] args) {
        int res = summaFor(2345);
        int res2 = summaWhile(2345);
        System.out.println("For: " + res + " | While: " + res2);
    }

    public static int summaFor(int a) {
        int result = 0;
        for (int current = a; current !=0; current /=10){
            result += current % 10;
        }

        return result;
    }

    public static int summaWhile(int a) {
        int result = 0;
        int current = a;
        while (current != 0) {
            result += current % 10;
            current /= 10;
        }

        return result;
    }
}
