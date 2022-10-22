package Study;

/**
 * 1) В методе StringBuilder addTo добавьте все строки из массива.
 * 2) В методе StringBuilder replace замените строку с помощью индексов, которые передаются в методе main
 */

public class StringBuilderzz {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //напишите тут ваш код
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
        }
        return builder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //напишите тут ваш код
        StringBuilder builder2 = new StringBuilder(string);
        return builder2.replace(start, end, str);
    }
}
