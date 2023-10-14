package interface2.practice1;

public class CarMeasurable implements Measurable {
    @Override
    public double getMeasurable(Object o) {
        Car car = (Car) o;
        return car.getKiloDriven();
    }
}
