package Zadachi;

import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicates {
    public static void main(String[] args) {
        System.out.println(countDuplicateCharacters("szdfsdfszdfzsdfiweowhetn"));
    }
    public static Map<Character, Long> countDuplicateCharacters(String str) {
        Map<Character, Long> result = str.chars ()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return  result;
    }
}
