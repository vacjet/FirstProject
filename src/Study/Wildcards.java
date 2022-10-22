package Study;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
//        List<?> list = new ArrayList<>();
//        List<? extends Number> list4 = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.18);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("stop");
        list2.add("start");
        showListInfo(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(4);
        list3.add(5);
        showListInfo(list3);

        // список для нахождения суммы:
        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.14);
        ald.add(3.15);
        System.out.println(summ(ald));
    }

    static void showListInfo(List<?> list) {
        System.out.println("Список содержит элементы: " + list);
    }

    // ищем сумму элементов списка:
    public static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
