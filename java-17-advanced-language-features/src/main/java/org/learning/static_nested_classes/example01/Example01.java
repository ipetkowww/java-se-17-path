package org.learning.static_nested_classes.example01;

//import org.learning.static_nested_classes.example01.Enclosing.Nested;

public class Example01 {

    public static void main(String[] args) {
        Enclosing.Nested nested = new Enclosing.Nested();

        //if you uncomment import at line 3 you can initialize static nested class as follow:
        //Nested nested = new Nested();

    }
}
