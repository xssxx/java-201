package interface2.practice2;

import interface2.practice2.comparators.Comparator;

public class Data {
    public static <T>void sort(T[] a, Comparator<T> cmp) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (cmp.compare(a[j], a[minPos]) < 0) {
                    minPos = j;
                }
            }
            T temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }
}
