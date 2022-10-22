package Zadachi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonDuplicate {
    public static void main(String[] args) {
        System.out.println (firstNonRepeatedCharacter("dsosgdfszdofianawmieninosdp"));
    }

    public static String firstNonRepeatedCharacter(String str) {
        Map<Integer, Long> chs = str.codePoints()
                .mapToObj(cp -> cp)
                .collect(Collectors
                        .groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        int cp = chs.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L).findFirst().map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));
        return String.valueOf(Character.toChars(cp));
    }
}
