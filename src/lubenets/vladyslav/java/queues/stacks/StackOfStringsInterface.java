package lubenets.vladyslav.java.queues.stacks;

/**
 * Created by vladla on 11/23/16.
 */
public interface StackOfStringsInterface<E> {

    void push(E element);
    E pop();
    boolean isEmpty();
    int size();

}
