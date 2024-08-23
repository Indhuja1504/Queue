
import java.util.*;
public class queue {
    private Deque<Integer> deque;
    
    public queue(int value) {
        deque = new ArrayDeque<>();
    }
    
    public void enqueue(int value) {
        deque.addLast(value);
    }
    
    public int dequeue() {
        return deque.removeFirst();       
}

    public boolean isEmpty() {
        return deque.isEmpty();
    }
    public int size() {
        return deque.size();
    }
    
    public static void main(String[] args) {
        queue queue = new queue(0); 

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        // queue.offerLast(6);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Queue is empty: " + queue.isEmpty()); 
        System.out.println("Queue size: " + queue.size()); 
        System.out.println(queue.deque);
    } 
}
