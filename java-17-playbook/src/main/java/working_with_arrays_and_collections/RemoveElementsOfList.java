package working_with_arrays_and_collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsOfList {

    public static void main(String[] args) {
        List<Integer> nums = List.of(20, 30, 40, 50); //immutable list
//        nums.remove(1); UnsupportedOperationsException

        ArrayList<Integer> nums2 = new ArrayList<>(List.of(20, 30, 40, 50));
        nums2.removeIf(number -> number < 40);
        System.out.println(nums2);

        ArrayList<String> strings = new ArrayList<>(List.of("Marie", "Jake", "Jon", "Sarah"));
        strings.removeIf(name -> name.endsWith("ie"));
        System.out.println(strings);
    }
}
