package lubenets.vladyslav.java.quicksort;

import edu.princeton.cs.algs4.StdRandom;
import lubenets.vladyslav.java.utils.SortUtils;

/**
 * Created by vladla on 1/12/17.
 *
 * Quick-select takes linear time on average
 */
public class QuickSelect {

    public static Comparable select(Comparable[] a, int k) {
        StdRandom.shuffle(a);
        int lo = 0, hi = a.length - 1;
        while (hi > lo) {
            int j = partition(a, lo, hi);
            if (j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                return a[k];
            }
        }
        return a[k];
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
