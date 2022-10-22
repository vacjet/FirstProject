package Study;

/**
 * Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
 * Незаполненная часть состоит из пробелов.
 */
public class BSquare {
    public static void main(String[] args) {
        int n = 0;
        while (n < 10) {
            int m = 0;
            while (m < 20) {
                if (n == 0 | m == 0 | n == 9 | m == 19) {
                    System.out.print("Б");
                    m++;
                }else {
                    System.out.print(" ");
                    m++;
                }
            }
            System.out.println();
            n++;
        }
    }
}
