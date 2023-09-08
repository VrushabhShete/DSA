import java.util.LinkedList;

public class QueueLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(6);
        queue.add(4);

        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.element());
    }
}
