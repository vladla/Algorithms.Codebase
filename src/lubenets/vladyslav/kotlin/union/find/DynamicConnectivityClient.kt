package lubenets.vladyslav.kotlin.union.find

import edu.princeton.cs.algs4.StdOut
import edu.princeton.cs.algs4.UF
import lubenets.vladyslav.utils.StdIn
import java.io.File

/**
 * Created by vladla on 10/27/16.
 */
class DynamicConnectivityClient {

    fun main(args : Array<String>) {
        val file : File = File("/Users/vladla/Downloads/algs4-data/tinyUF.txt")
        val n = StdIn.readInt(file)
        val uf = UF(n)
        while (!StdIn.isEmpty()) {
            val p = StdIn.readInt()
            val q = StdIn.readInt()
            if (!uf.connected(p, q)) {
                uf.union(p, q)
                StdOut.println("$p $q")
            }
        }
    }

}