package store.counters;

import store.Product;

import java.util.List;

public class CountProductInStockCounter implements Counter {
    @Override
    public int countProduct(List<Product> products) {
        int count = 0;
        for (Product prod : products) {
            if (prod.getQuantity() > 0)
                count += 1;
        }
        return count;
    }
}
