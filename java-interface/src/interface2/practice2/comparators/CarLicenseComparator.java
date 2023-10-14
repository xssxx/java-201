package interface2.practice2.comparators;

import interface2.practice2.Car;

public class CarLicenseComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getLicense().compareTo(o2.getLicense());
    }
}
