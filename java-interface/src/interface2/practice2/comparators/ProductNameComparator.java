package interface2.practice2.comparators;

import interface2.practice2.Product;

public class ProductNameComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
