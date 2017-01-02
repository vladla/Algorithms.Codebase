package lubenets.vladyslav.java.union.find;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;
import lubenets.vladyslav.utils.StdIn;

import java.io.File;

/**
 * Created by vladla on 10/27/16.
 *
 * http://algs4.cs.princeton.edu/home/
 *
 */
public class DynamicConnectivityClient {
    public static void main(String ... args) {
        File file = new File("/Users/vladla/Downloads/algs4-data/tinyUF.txt");
        int n = StdIn.readInt(file);
        UF uf = new UF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p,q)) {
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }
    }
}
