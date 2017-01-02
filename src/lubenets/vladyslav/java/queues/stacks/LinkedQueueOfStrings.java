package lubenets.vladyslav.java.queues.stacks;

/**
 * Created by vladla on 11/30/16.
 */
public class LinkedQueueOfStrings implements QueueOfStrings {

    Node first;
    Node last;

    private class Node {
        String value;
        Node next;
    }

    @Override
    public void enqueue(String item) {
        Node oldLast = last;
        last = new Node();
        last.value = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    @Override
    public String dequeue() {
        String value = first.value;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return 0;
    }
}
