package working_with_arrays_and_collections;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3"};

        String[] append = append(arr, "4");
        System.out.println(Arrays.toString(append));
    }

    private static <T> T[] append(T[] sourceArray, T newElement) {
        int size = sourceArray.length;
        T[] result = Arrays.copyOf(sourceArray, size + 1);
        result[size] = newElement;
        return result;
    }
}
