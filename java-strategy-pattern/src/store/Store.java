package store;

import store.counters.Counter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
    }

    public int countProduct(Counter counter) {
        return counter.countProduct(products);
    }

}
