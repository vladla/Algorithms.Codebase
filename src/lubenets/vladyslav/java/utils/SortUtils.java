package lubenets.vladyslav.java.utils;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by vladla on 12/11/16.
 */
public class SortUtils {
    public static void exchange(Comparable[] comparables, int j, int min) {
        Comparable swappable = comparables[min];
        comparables[min] = comparables[j];
        comparables[j] = swappable;
    }

    public static boolean less(Comparable comparable1, Comparable comparable2) {
        return comparable1.compareTo(comparable2) < 0;
    }

    public static void shuffle(Comparable[] objects) {
        for (int i = 0; i < objects.length; i++) {
            int uniform = StdRandom.uniform(i + 1);
            exchange(objects, i, uniform);
        }
    }
}
