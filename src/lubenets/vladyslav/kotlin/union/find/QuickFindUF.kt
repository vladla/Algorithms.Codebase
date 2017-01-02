package lubenets.vladyslav.kotlin.union.find

/**
 * Created by vladla on 10/27/16.
 *
 * Number of array accesses
 * initialize - N
 * union - N
 * find - 1
 *
 * it takes N*N array accesses to process a sequence of N union commands on N objects
 *
 */

class QuickFindUF {

    private var id : IntArray

    constructor(n : Int) {
        this.id = IntArray(n)
        for (i in id) {
            id[i] = i
        }
    }

    fun connected(p : Int, q : Int) : Boolean {
        return id[p] == id[q]
    }

    fun union(p : Int, q : Int) {
        val pid : Int = id[p]
        val qid : Int = id[q]
        for (i in id) {
            if (id[i] == pid) id[i] = qid
        }
    }


    fun main(args: Array<String>) {
    }
}
