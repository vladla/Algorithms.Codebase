package lubenets.vladyslav.java.queues.stacks;

/**
 * Created by vladla on 11/23/16.
 * A stack with N items uses ~ 40 N bytes
 *
 */
public class StackOfStringsLinkedList implements StackOfStringsInterface<String> {

    private Node first;

    private class Node {
        String value;
        Node next;
    }

    @Override
    public void push(String element) {
        Node oldFirst = first;
        first = new Node();
        first.value = element;
        first.next = oldFirst;
    }

    @Override
    public String pop() {
        String value = first.value;
        first = first.next;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        // TODO: 11/23/16 complete
        return 0;
    }

    public static void main(String... args) {

    }

}
