package working_with_arrays_and_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToFromArray {

    public static void main(String[] args) {
        String[] array = {"1", "2", "3"};
        List<String> list = new ArrayList<>(List.of(array));

        System.out.println("List Before: " + list);
        list.add("4");
        list.add("5");
        list.remove("1");
        System.out.println("List After: " + list);

        String[] result = list.toArray(String[]::new);
        System.out.println("Back to array: " + Arrays.toString(result));

        // if you receive an array with primitive types and have to convert it to list
        int[] ints = {1, 2, 3, 4};
        List<Integer> listInts = Arrays.stream(ints).boxed().toList(); //toList() returns immutable list

    }
}
