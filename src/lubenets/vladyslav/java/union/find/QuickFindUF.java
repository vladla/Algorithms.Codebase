package lubenets.vladyslav.java.union.find;

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
public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int n) {
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) id[i] = qid;
        }
    }

}
