package Study;

import java.util.Arrays;

public class BubbleSortStringArray {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        String[] array_return = new String[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != null) {
                array_return[j] = array[i];
                j++;
            }
        }
        System.arraycopy(array_return, 0, array, 0, array.length);

    }
}
