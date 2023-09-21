package working_with_arrays_and_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateListAndAddElement {

    public static void main(String[] args) {

        // Creates a fully modifiable list
        ArrayList<String> strings3 = new ArrayList<>(Arrays.asList("a", "b"));
        strings3.add("c");
        strings3.add("d");

        // Here, existing elements can be changed. Cannot resize
        List<String> strings2 = Arrays.asList("a", "b", null);
        strings2.set(0, "c");

        // Creates immutable list that even does not allow null
        List<String> strings = List.of("a", "b"); //prefer this
    }
}
