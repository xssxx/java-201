package store.counters;

import store.Product;

import java.util.List;

public interface Counter {
    int countProduct(List<Product> products);
}
