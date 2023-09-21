package working_with_arrays_and_collections;

import java.util.Map;

public class MapCheckEquality {

    public static void main(String[] args) {
        Map<Integer, String> mapOne = Map.of(1, "Java", 2, "C#", 3, "JavaScript");
        Map<Integer, String> mapTwo = Map.of(1, "Java", 2, "C#", 3, "JavaScript");
        Map<Integer, String> mapThree = Map.of(1, "Java", 2, "C#", 4, "JavaScript");

        System.out.println(mapOne.equals(mapTwo)); // true
        System.out.println(mapOne.equals(mapThree)); // false

        Map<Integer, LanguageRecord> langRecordOne = Map.of(1, new LanguageRecord("Java"));
        Map<Integer, LanguageRecord> langRecordTwo = Map.of(1, new LanguageRecord("Java"));
        System.out.println("Wit records: " + langRecordOne.equals(langRecordTwo)); // true
    }

    record LanguageRecord(String name) {
    }
}
