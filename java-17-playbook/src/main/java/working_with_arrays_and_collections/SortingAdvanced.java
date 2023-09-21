package working_with_arrays_and_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingAdvanced {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Jake", 28),
                new Person("Don", 30),
                new Person("Andy", 40),
                new Person("John", 36),
                new Person("John", 35)
        ));

        people.sort(Comparator.comparing(Person::age));
        System.out.println("Compared by age: " + people);

        people.sort(Comparator.comparing(Person::name));
        System.out.println("Compared by name: " + people);
    }

    record Person(String name, int age) {

        @Override
        public String toString() {
            return "%s=%d".formatted(name(), age());
        }
    }
}
