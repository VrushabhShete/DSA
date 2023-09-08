class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class CircularInsertionAtStartOptimized {

    static Node insert(Node head, int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            head.next = head;
        }
        newnode.next = head.next;
        head.next = newnode;

        int temp = newnode.data;
        newnode.data = head.data;
        head.data = temp;

        return head;
    }

    static void display(Node head){
        Node temp = head;

        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != head);
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);
        head = insert(head, 5);

        display(head);
    }
}
