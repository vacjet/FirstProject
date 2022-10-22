package Study;

import java.util.Scanner;

public class FillMinAray {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int min = ints[0];
        for (int number : ints) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
}
