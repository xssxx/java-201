package interface2.practice2.comparators;

import interface2.practice2.Car;

public class CarKiloDrivenComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.getKiloDriven(), o2.getKiloDriven());
    }
}
