package lubenets.vladyslav.java.mergesort;

import static lubenets.vladyslav.java.utils.SortUtils.less;

/**
 * Created by vladla on 12/14/16.
 *
 * Java sort for objects
 *
 * In computer science, an in-place algorithm is an algorithm which transforms input using no auxiliary data structure.
 * A sorting algorithm is in-place if it uses ≤ c log N extra memory.
 *
 * at most N log N compares and 6N lg N array accesses to  sort array of size N
 *
 */
public class MergeSort {

    public static void sort(Comparable[] objects) {
        Comparable[] aux = new Comparable[objects.length];
        sort(objects, aux, 0, objects.length-1);
    }

    private static void sort(Comparable[] objects, Comparable[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(objects, aux, lo, mid);
        sort(objects, aux, mid + 1, hi);
        merge(objects, aux, lo, mid, hi);
    }

    private static void merge(Comparable[] objects, Comparable[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = objects[k];
        }
        int i = lo; int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) objects[k] = aux[j++];
            else if (j > hi) objects[k] = aux[i++];
            else if (less(objects[j], objects[i])) objects[k] = aux[j++];
            else objects[k] = objects[i++];
        }
    }


}
