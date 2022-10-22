package Zadachi;

public class StringIsOnlyDigit {
    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("-98429"));
        System.out.println(containsOnlyDigits2("540861301"));
        System.out.println(containsOnlyDigits3("88512"));
    }

    // самое быстрое решение
    public static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigits2(String str) {
        return !str.chars().anyMatch(n -> !Character.isDigit(n));
    }

    // решение с помощью regex будет медленнее
    public static boolean containsOnlyDigits3(String str) {
        return str.matches("[0-9]+");
    }
}
