package lubenets.vladyslav.java.elementary.sorts;

/**
 * Created by vladla on 12/13/16.
 */
public class BubbleSort {

    public static void sort(Comparable[] oblects) {
        Comparable temp;
        for (int i = 0; i < oblects.length - 1; i++) {
            for (int j = 1; j < oblects.length; j++) {
                if (oblects[j-1].compareTo(oblects[j]) > 0) {
                    temp = oblects[j];
                    oblects[j] = oblects[j-1];
                    oblects[j-1] = temp;
                }
            }
        }
    }

}
