import java.util.ArrayDeque;
import java.util.Stack;

public class ReverseQueue {

    static ArrayDeque<Integer> queue;

    static void reverse(){
        Stack<Integer> stack = new Stack<>();
        
        while(queue.isEmpty() == false){
            stack.add(queue.peek());
            queue.poll();
        }
        while(stack.isEmpty() == false){
            queue.offer(stack.peek());
            stack.pop();
        }
    }

    public static void main(String[] args) {
        queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);
        queue.offer(9);
        queue.offer(10);

        reverse();

        while(queue.isEmpty() == false){
            System.out.print(queue.peek() + " ");
            queue.poll();
        }
    }
}
