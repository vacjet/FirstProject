package Study;

public class Replacement {
    public static void main(String[] args) {
        String value = "текст :( снова какой-то текст :( и еще :( и снова :(";
        String result = replace (value);
        System.out.println(result);
    }

    public static String replace(String value){
        return value.replace(":(", ":)");
    }
}
