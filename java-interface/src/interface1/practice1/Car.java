package interface1.practice1;

public class Car implements Measurable {
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
    public double getMeasurable() {
        return kiloDriven;
    }
}
