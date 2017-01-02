package lubenets.vladyslav.java.queues.stacks;

/**
 * Created by vladla on 11/23/16.
 */
public class FixedCapacityStackOfStrings implements StackOfStringsInterface<String> {

    private String[] elements;
    private int n;

    public FixedCapacityStackOfStrings(Integer capacity) {
        this.elements = new String[capacity];
    }

    @Override
    public void push(String element) {
        elements[n++] = element;
    }

    @Override
    public String pop() {
        return elements[--n];
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return elements.length;
    }
}
