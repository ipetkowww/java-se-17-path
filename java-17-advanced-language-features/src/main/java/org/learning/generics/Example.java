package org.learning.generics;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        MyClass<Integer> myClass = new MyClass<>(numbers);

        System.out.println(myClass.values());
    }
}
