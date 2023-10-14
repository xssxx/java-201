package interface2.practice1;

public class ProductMeasurable implements Measurable {

    @Override
    public double getMeasurable(Object o) {
        Product product = (Product) o;
        return product.getPrice();
    }
}
