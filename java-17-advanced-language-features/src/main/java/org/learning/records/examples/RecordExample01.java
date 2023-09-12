package org.learning.records.examples;

import org.learning.records.Customer;

public class RecordExample01 {

    public static void main(String[] args) {
        Customer customer = new Customer(42342342L, null, null);
        System.out.println(customer.name());

        Customer copy = new Customer(customer.id(), customer.name(), customer.email());

        System.out.println(customer);
        System.out.println(copy);
    }
}
