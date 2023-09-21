package working_with_arrays_and_collections;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {

    public static void main(String[] args) {

        Map<Language, String> programmingLanguages = Map.of(
                new Language(), "Java",
                new Language(), "C#",
                new Language(), "Go");

        System.out.println(sortByValueStream(programmingLanguages, Comparator.naturalOrder()));
        System.out.println(sortByValueStream(programmingLanguages, Comparator.reverseOrder()));
    }

    static <K, V>Map<K, V> sortByValueStream(Map<K, V> map, Comparator<? super V> comparator) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(comparator))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
    }

    static class Language {

        @Override
        public String toString() {
            return "Language";
        }
    }
}
