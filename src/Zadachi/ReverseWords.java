package Zadachi;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverse("sasa dada"));
    }

    public static String reverse(String str) {
//        return new StringBuilder(str).reverse().toString();  //not thread-safe
        return new StringBuffer(str).reverse().toString();
    }
}
