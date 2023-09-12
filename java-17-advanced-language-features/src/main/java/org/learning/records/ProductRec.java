package org.learning.records;

public record ProductRec(long id, String name, String description) {

    // The compiler translates this to a final class with private final fields for the components
    // The compiler generates a constructor that initialize the fields

    // The compiler generates accessor methods:
    // public long id() { return this.id; }
    // public String name() { return this.name; }
    // public String description { return this.description; }

    // Instance fields are not allowed
    // private int value;

    // Static fields are allowed
    private final static int VALUE = 23;

    public boolean hasDescription() {
        return description != null && !description.isBlank();
    }
}
