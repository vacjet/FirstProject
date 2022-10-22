package Study;

public class StringChange {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int x = path.indexOf("jdk");
        int y = path.indexOf("/", path.indexOf("jdk"));
        String first = path.substring(0, x);
        String last = path.substring(y);

        return first + jdk + last;
    }
}
