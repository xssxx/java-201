package interface1.practice2;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("p1", 100),
                new Product("p2", 50.5),
                new Product("p2", 200)
        };

        Data.sort(products);
        for (Product product : products) {
            System.out.print(product + " ");
        }
        System.out.println();

        Car[] cars = {
                new Car("A", 1000),
                new Car("B", 3000),
                new Car("C", 2000)
        };

        Data.sort(cars);
        for (Product product : products) {
            System.out.print(product + " ");
        }
    }

}
