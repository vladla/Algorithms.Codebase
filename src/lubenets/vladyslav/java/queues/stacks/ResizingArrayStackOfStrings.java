package lubenets.vladyslav.java.queues.stacks;

/**
 * Created by vladla on 11/23/16.
 */
public class ResizingArrayStackOfStrings implements StackOfStringsInterface<String> {

    private String[] elements;
    private int n;

    public ResizingArrayStackOfStrings() {
        this.elements = new String[1];
    }

    @Override
    public void push(String element) {
        if (n == element.length()) resize(element.length() * 2);
        elements[n++] = element;
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < elements.length; i++) {
            copy[i] = elements[i];
        }
        elements = copy;
    }

    @Override
    public String pop() {
        String item = elements[--n];
        elements[n] = null;
        if (n > 0 && n == elements.length/4) resize(elements.length/2);
        return item;
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
