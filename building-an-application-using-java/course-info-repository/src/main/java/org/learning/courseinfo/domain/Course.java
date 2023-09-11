package org.learning.courseinfo.domain;

public record Course(String title, String level) {

    public Course {
        filled(title);
        filled(level);
    }

    private void filled(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("No value presented!");
        }
    }
}
