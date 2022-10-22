package Study;

import java.util.Scanner;

/*
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ. Выведи на экран максимальное четное число из введенных. Если введено несколько таких чисел, необходимо вывести любое из них.
 */
public class MaxValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if ((x % 2) == 0) {
                if (x > max) max = x;
            }
        }
        System.out.println(max);
    }
}
