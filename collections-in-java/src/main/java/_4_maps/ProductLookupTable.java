package _4_maps;

public interface ProductLookupTable {

    Product lookupById(int id);

    void addProduct(Product productToAdd);

    void clear();
}
