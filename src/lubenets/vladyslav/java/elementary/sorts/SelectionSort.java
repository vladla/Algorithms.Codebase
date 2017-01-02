package lubenets.vladyslav.java.elementary.sorts;

import static lubenets.vladyslav.java.utils.SortUtils.exchange;
import static lubenets.vladyslav.java.utils.SortUtils.less;

/**
 * Created by vladla on 12/11/16.
 *
 * ~ N*N/2 compares and N exchanges
 */
public class SelectionSort {

    public static void sort(Comparable[] comparables) {
        int length = comparables.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i+1; j < length; j++) {
                if (less(comparables[j], comparables[min])) {
                    min = j;
                }
            }
            exchange(comparables, i, min);
        }
    }


}
