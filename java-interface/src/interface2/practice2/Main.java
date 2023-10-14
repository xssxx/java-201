package interface2.practice2;

import interface2.practice2.comparators.CarKiloDrivenComparator;
import interface2.practice2.comparators.CarLicenseComparator;
import interface2.practice2.comparators.ProductNameComparator;
import interface2.practice2.comparators.ProductPriceComparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("p3", 500),
                new Product("p2", 200),
                new Product("p1", 400)
        };

        Data.sort(products, new ProductPriceComparator());
        System.out.println("Sort product by price");
        for (Product product : products) {
            System.out.print(product + " ");
        }
        System.out.println();

        Data.sort(products, new ProductNameComparator());
        System.out.println("Sort product by Name");
        for (Product product : products) {
            System.out.print(product + " ");
        }
        System.out.println();

        Car[] cars = {
                new Car("c3", 5000),
                new Car("c2", 2000),
                new Car("c1", 3000)
        };

        Data.sort(cars, new CarLicenseComparator());
        System.out.println("Sort car by license");
        for (Car car : cars) {
            System.out.print(car + " ");
        }
        System.out.println();

        Data.sort(cars, new CarKiloDrivenComparator());
        System.out.println("Sort car by kilo driven ");
        for (Car car : cars) {
            System.out.print(car + " ");
        }
    }
}
