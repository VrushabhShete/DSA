public class QueueBasic {
    int front, rear, cap;
    int[] arr;

    QueueBasic(int cap){
        this.cap = cap;
        front = -1;
        rear = -1;
        arr = new int[cap];
    }

    boolean isFull(){
        return (rear == cap-1);
    }

    boolean isEmpty(){
        return(front == -1);
    }

    void enqueue(int item){
        if(isFull())
        return;
        if(front == -1){
            front = 0;
        }
        rear++;
        arr[rear] = item;
    }

    void dequeue(){
        if(isEmpty())
        return;
        front++;
        if(front > rear){
            front = -1;
            rear = -1;
        }      
    }

    int front(){
        if(isEmpty())
        return -1;
        return arr[front];
    }

    int rear(){
        if(isEmpty())
        return -1;
        return arr[rear];
    }

    public static void main(String[] args) {
        QueueBasic queue = new QueueBasic(5);

        queue.enqueue(8);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(4);

        System.out.println("Front: " + queue.front());
        System.out.println("Rear: " + queue.rear());
    }
}
