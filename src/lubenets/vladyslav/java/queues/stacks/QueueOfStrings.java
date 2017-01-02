package lubenets.vladyslav.java.queues.stacks;

/**
 * Created by vladla on 11/28/16.
 */
public interface QueueOfStrings {
    void enqueue(String item);
    String dequeue();
    boolean isEmpty();
    int size();
}
