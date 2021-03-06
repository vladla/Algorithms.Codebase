package lubenets.vladyslav.java.quicksort;

import edu.princeton.cs.algs4.StdRandom;
import lubenets.vladyslav.java.utils.SortUtils;

/**
 * Created by vladla on 12/14/16.
 *
 * Number of compares ~ N lg N(best case) and ~ 1/2N*N(worst-case) and ~2NlnN(average)
 * Number of exchanges ~ 1/3NlnN(average)
 * in-place
 * not-stable
 *
 * Quicksort with duplicate keys - Algorithm goes quadratic unless partitioning stops on equal keys!
 *
 */
public class QuickSort {

    public static void sort(Comparable[] objects) {
        StdRandom.shuffle(objects);
        sort(objects, 0, objects.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (SortUtils.less(a[++i], a[lo])) {
                if (i == hi) break;
            }
            while (SortUtils.less(a[lo], a[--j])) {
                if (j == lo) break;
            }
            if (i >= j) {
                break;
            }
            SortUtils.exchange(a, i, j);
        }
        SortUtils.exchange(a, lo, j);
        return j;
    }

}
