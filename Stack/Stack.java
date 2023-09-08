public class Stack {
    int size = 5;
    int top = -1; 
    int[] a = new int[size];

    void push(int num){
        if(top == size-1)
        System.out.println("Stack underflow");
        else{
            top++;
            a[top] = num;
        }
    }

    void pop(){
        if(top == -1)
        System.out.println("Stack underflow");
        else{
            System.out.println(a[top] + "Pop success");
            top--;
        }
    }

    int peek(){
        return a[top];
    }

    int capacity(){
        return size-1;
    }

    boolean isEmpty(){
        if(top == -1)
        return true;
        else
        return false;
    }

    boolean isFull(){
        if(top == size-1)
        return true;
        else
        return false;
    }


    public static void main(String[] args) {
        Stack s = new Stack();
        s.pop();
        System.out.println(s.isEmpty());
        s.push(4);
        s.push(6);
        System.out.println(s.peek());
        s.push(0);
        s.push(2);
        s.push(8);
        System.out.println(s.peek());
        System.out.println(s.isFull());
    }
}
