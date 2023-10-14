package store;

import store.counters.CountAllProductCounter;
import store.counters.CountProductInStockCounter;
import store.counters.CountProductQuantityCounter;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct("Big java", 300, 5);
        store.addProduct("Da Vinci Code", 120, 0);
        store.addProduct("Python 101", 200, 10);

        System.out.println(store.countProduct(new CountAllProductCounter()));
        System.out.println(store.countProduct(new CountProductQuantityCounter()));
        System.out.println(store.countProduct(new CountProductInStockCounter()));
    }
}