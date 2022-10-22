package Study;
/**
 * Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
 * Вывести на экран полученную сумму и завершить программу.
 */

import java.util.Scanner;

public class VvodSummiChisel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isEnter = false;
        int sum = 0;
        while (!isEnter) {
            int i = sc.nextInt();
            sum += i;
            if (sc.hasNextLine()) {
                isEnter = sc.hasNext("ENTER");
            }
        }
        sc.close();
        System.out.println(sum);
    }
}
