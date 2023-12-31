package _2_collections_introduction;

import common.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionConcepts {

    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        // Iterating with foreach
        for (Product product : products) {
            System.out.println(product);
        }

        // Refactor to use iterator to remove products.
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            final Product product = iterator.next();
            if (product.weight() > 20) {
                iterator.remove();
            }
        }
        System.out.println(products);

        // 4. other methods
        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(floorPanel));
        products.remove(floorPanel);
        System.out.println(products.contains(floorPanel));

        // 5. removeAll
        List<Product> toRemove = new ArrayList<>();
        toRemove.add(door);
        toRemove.add(floorPanel);

        products.removeAll(toRemove);
        System.out.println(products);
    }
}
