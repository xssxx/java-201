package interface2.practice1;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("p1", 100),
                new Product("p2", 50.5),
                new Product("p2", 200)
        };

        System.out.println(Data.min(products, new ProductMeasurable()));

        Car[] cars = {
                new Car("A", 1000),
                new Car("B", 3000),
                new Car("C", 2000)
        };

        System.out.println(Data.min(cars, new CarMeasurable()));
    }

}
