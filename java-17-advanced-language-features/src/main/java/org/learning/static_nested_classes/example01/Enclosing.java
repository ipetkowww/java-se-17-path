package org.learning.static_nested_classes.example01;

import java.time.LocalDate;

public class Enclosing {

    private static final int NUMBER = 23;
    private static final LocalDate DATE = LocalDate.of(2023, 1, 1);

    private static void printNumber() {
        System.out.println(NUMBER);
    }

    private static void printDate() {
        System.out.println(DATE);
    }

    private void printName() {
        System.out.println("Ivan");
    }

    static class Nested {

        private final LocalDate date = LocalDate.of(2011, 8, 9);

        private void printDate() {
            System.out.println(date);
        }

        void run() {
            System.out.println(date); // date in class Nested
            printDate(); // printDate() in class Nested

            System.out.println(Enclosing.DATE); // date in class Enclosing
            Enclosing.printDate(); // printDate() in class Enclosing

            printNumber();
            //printName() - Cannot be used here because it is not static
        }
    }
}
