package org.learning.records.examples;

import org.learning.records.ProductRec;

public class RecordsExample {

    public static void main(String[] args) {
        ProductRec productRec = new ProductRec(1, "Banana", "It's a fruit");
        String result = "Product %d has name: %s".formatted(productRec.id(), productRec.name());
        System.out.println(result);
        System.out.println("Does it have a description? " + productRec.hasDescription());
    }
}
