package interface1.practice1;

public class Data {
    public static double min(Measurable[] measures) {
        double min = Double.MAX_VALUE;
        for (Measurable measurable : measures) {
            if (measurable.getMeasurable() < min) {
                min = measurable.getMeasurable();
            }
        }
        return min;
    }

}
