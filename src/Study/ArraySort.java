package Study;

public class ArraySort {
    public static void sortirovka(int[] arr) {
        for (int q = 1; q < arr.length; q++) {
            for (int w = arr.length - 1; w >= q; w--) {
                if (arr[w - 1] > arr[w]) {
                    int tmp = arr[w - 1];
                    arr[w - 1] = arr[w];
                    arr[w] = tmp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {4, -5, 0, 2, -1, 8, 3};
        sortirovka(array1);
    }
}
