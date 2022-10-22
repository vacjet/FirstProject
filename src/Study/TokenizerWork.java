package Study;
/**
 * Используя StringTokenizer раздели query на части по разделителю delimiter.
 * На выходе возвращает массив строк  * {"java", "util", "stream"}
 */

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenizerWork {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, ".");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        String[] result = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            result[i++] = tokenizer.nextToken();
        }
        return result;
    }
}
