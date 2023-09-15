package org.learning.local_types;

public class LocalTypesExample {

    private String name = "Joe Smith";

    public void example(int x, int y) {
        int number = 25;

        class Local {
            void method() {
                System.out.println(x + y);
                System.out.println(number);
                System.out.println(name);
            }

        }

        Local local = new Local();
        local.method();

        // number++; cannot because it is effectively final
        name = "Susan Jones";
    }
}
