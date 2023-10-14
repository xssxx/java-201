package store.counters;

import store.Product;

import java.util.List;

public class CountProductQuantityCounter implements Counter {
    @Override
    public int countProduct(List<Product> products) {
        int count = 0;
        for (Product prod : products) {
            count += prod.getQuantity();
        }
        return count;
    }
}
