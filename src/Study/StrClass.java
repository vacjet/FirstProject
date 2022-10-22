package Study;

public class StrClass {
    public static void main(String[] args) {
        email("ya@yandex.ru; he@google.com; she@yahoo.com;");
    }

    private static void email(String e) {
        char c2 = ';';
        char c3 = '@';
        char c4 = '.';
        int ind = e.indexOf(c3) + 1;
        int ind2 = e.indexOf(c4);
        String s1 = e.substring(ind, ind2);
        System.out.println(s1);
    }

}
