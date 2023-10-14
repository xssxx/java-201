package interface1.practice2;

public class Car implements Comparable {
    private String license;
    private double kiloDriven;

    public Car(String license, double kiloDriven) {
        this.license = license;
        this.kiloDriven = kiloDriven;
    }

    public String getLicense() {
        return license;
    }
    public double getKiloDriven() {
        return kiloDriven;
    }

    @Override
    public int compareTo(Object other) {
        Car otherCar = (Car) other;
        return Double.compare(this.getKiloDriven(), otherCar.getKiloDriven());
    }

    @Override
    public String toString() {
        return "Car{" +
                "license='" + license + '\'' +
                ", kiloDriven=" + kiloDriven +
                '}';
    }
}
