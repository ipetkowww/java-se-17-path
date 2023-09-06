package _5_sets;

import common.Product;
import common.Supplier;

import java.util.*;

public class WeightAwareProductCatalogue implements Iterable<Product> {

    private final NavigableSet<Product> products =
            new TreeSet<>(Product.BY_WEIGHT);

    public void addSupplier(final Supplier supplier) {
        products.addAll(supplier.getProducts());
    }

    public Set<Product> findLighterProducts(final Product product) {
        return products.headSet(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
