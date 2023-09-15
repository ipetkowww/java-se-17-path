package org.learning.inner_classes;

public class Enclosing {

    private final String name = "Joe Smith";

    public void createInner() {
        Inner inner = this.new Inner();
    }

    class Inner {

        private final String name = "Susan Jones";

        void run() {
            System.out.println(name); // Susan Jones
            System.out.println(Enclosing.this.name); // Joe Smith
        }
    }
}
