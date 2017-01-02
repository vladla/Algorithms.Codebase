package lubenets.vladyslav.java.elementary.sorts;

import static lubenets.vladyslav.java.utils.SortUtils.exchange;
import static lubenets.vladyslav.java.utils.SortUtils.less;

/**
 * Created by vladla on 12/13/16.
 */
public class ShellSort {

    public static void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        while (h<n/3) h = h*3 +1;
        while (h>=1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j-=h) {
                    exchange(a, j, j-h);
                }
            }
            h=h/3;
        }
    }

    public static void main(String ... strings) {

    }

}
