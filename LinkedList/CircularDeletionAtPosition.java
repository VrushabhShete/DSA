class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class CircularDeletionAtPosition {

    static Node insert(Node head, int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            head.next = head;
            return head;
        }

        newnode.next = head.next;
        head.next = newnode;

        int temp = newnode.data;
        newnode.data = head.data;
        head.data = temp;
        head = newnode;
        return head;
    }

    static Node delete(Node head, int pos){
        int count = 0;

        if(pos < 1 || pos > calsize(head)){
            System.out.println("Invlaid position");
            return head;
        }   
        if(head == null){
            System.out.println("List empty");
            return head;
        }
        if(head.next == head){
            head = null;
            return head;
        }
        if(pos == 1){
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }
        Node temp = head;
        while(count < pos-2){
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
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

    static int calsize(Node head){
        int size = 0;
        Node temp = head;

        do{
            temp = temp.next;
            size++;
        }
        while(temp != head);
        return size;
    }
    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);
        head = insert(head, 5);
        head = delete(head, 2);
        display(head);
        System.out.println("\n" + calsize(head));
    }
}
