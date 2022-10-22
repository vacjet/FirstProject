package Study;

public class StringBuilderReverse {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        //напишите тут ваш код
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        String result = builder.toString();
        return result;
    }
}
