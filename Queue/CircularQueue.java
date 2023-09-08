public class CircularQueue {

    int front, rear, size, cap;
    int[] arr;

    CircularQueue(int cap){
        this.cap = cap;
        front = size = 0;
        rear =cap - 1;
        arr = new int[cap];
    }
    
    boolean isEmpty(){
        return(size == 0);
    }

    boolean isFull(){
        return (size == cap);
    }

    void enqueue(int item){
        if(isFull())
        return;
        rear = (rear + 1) % cap;
        arr[rear] = item;
        size = size +1;
        System.out.println(item + " Enqueued");
    }

    void dequeue(){
        if(isEmpty())
        return;
        int item = arr[front];
        front = (front + 1) % cap;
        size = size - 1;
        System.out.println(item  + " Dequeued");
    }

    int front(){
        if(isEmpty())
        return Integer.MIN_VALUE;
        return arr[front];

    }

    int rear(){
        if(isEmpty())
        return Integer.MAX_VALUE;
        return arr[rear];
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        
        queue.front();
        queue.rear();
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(6);
        queue.enqueue(2);
        queue.enqueue(10);

        queue.dequeue();
        queue.enqueue(10);

        System.out.println("Front "+queue.front());
        System.out.println("Rear "+queue.rear());
    }
    
}
