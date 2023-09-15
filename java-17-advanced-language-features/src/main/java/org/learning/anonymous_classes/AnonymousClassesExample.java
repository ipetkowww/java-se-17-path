package org.learning.anonymous_classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Joe", "Susan", "John", "Louise"));

//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

        // Same as above
        names.sort(Comparator.comparingInt(String::length));

        System.out.println(names);
    }
}
