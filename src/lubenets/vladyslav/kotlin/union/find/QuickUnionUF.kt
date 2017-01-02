package lubenets.vladyslav.kotlin.union.find

/**
 * Created by vladla on 10/27/16.
 *
 * initialize - N
 * union - N
 * find - N
 *
 */
class QuickUnionUF {
    private var id : IntArray

    constructor(n : Int) {
        id = IntArray(n)
        for (i in id) {
            id[i] = i
        }
    }

    fun root(i : Int) : Int {
        var k = i
        while (k != id[k]) {
            k = id[k]
        }
        return k
    }

    fun connected(p : Int, q : Int) : Boolean {
        return root(p) == root(q)
    }

    fun union(p : Int, q : Int) {
        val i = root(p)
        val j = root(q)
        id[i] = j
    }

}