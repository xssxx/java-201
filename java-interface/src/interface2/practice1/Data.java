package interface2.practice1;

public class Data {
    public static double min(Object[] data, Measurable measurable) {
        double min = Double.MAX_VALUE;
        for (Object object : data) {
            if (measurable.getMeasurable(object) < min) {
                min = measurable.getMeasurable(object);
            }
        }
        return min;
    }
}
