package lubenets.vladyslav.java.elementary.sorts;

import lubenets.vladyslav.java.utils.SortUtils;

/**
 * Created by vladla on 12/11/16.
 * ~ 1/4 N*N compares and ~ 1/4 N*N exchanges
 * Best - N-1 compares, 0 exchanges
 * Worst ~ 1/2 N*N compares and ~ 1/2 N*N exchanges
 */
public class InsertionSort {

    public static void sort(Comparable[] comparables) {
        int length = comparables.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (SortUtils.less(comparables[j], comparables[j-1])) {
                    SortUtils.exchange(comparables, j, j-1);
                } else break;
            }
        }
    }

}
