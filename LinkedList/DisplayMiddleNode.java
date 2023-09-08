class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class DisplayMiddleNode{

    static Node insert(Node head, int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return head;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;

        return head;
    }

    static void display(Node head){
        Node temp = head;

        System.out.println("\nThe original node is ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void displayMiddle(Node head){
        int middle = calsize(head) / 2;
        Node temp = head;
        for(int i=1; i <= middle; i++){
            temp = temp.next;
        }

        System.out.println("\nThe middle node is ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static int calsize(Node head){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);
        head = insert(head, 5);
        head = insert(head, 6);
        head = insert(head, 7);
        head = insert(head, 8);
        display(head);
        displayMiddle(head);
    }
}