package lubenets.vladyslav.java.quicksort;

import edu.princeton.cs.algs4.StdRandom;
import lubenets.vladyslav.java.utils.SortUtils;

/**
 * Created by vladla on 1/8/17.
 */
public class QuickSortMedianImprovement {

    private static final int CUTOFF = 10;

    public static void sort(Comparable[] objects) {
        StdRandom.shuffle(objects);
        sort(objects, 0, objects.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        //todo: implement it
//        int m = medianOf3(a, lo, lo + (hi - lo)/2, hi);
//        swap(a, lo, m);
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
