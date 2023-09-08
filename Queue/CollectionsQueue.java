import java.util.ArrayDeque;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(4);
        queue.offer(6);
        queue.offer(9);
        
        System.out.println(queue.poll());

        System.out.println(queue.peek());

    }
}
