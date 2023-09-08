class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class ReverseSinglyLinkedList {
    
    static Node insertStart(Node head, int data){
        Node newnode = new  Node(data);
        newnode.next = head;
        head = newnode;
        return head;
    }

    static Node insertLast(Node head, int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return head;
        }

        Node temp = head;

        while(temp.next != null)
        temp = temp.next;
        
        temp.next = newnode;

        return head;
    }

    public Node insertAtPosition(Node head, int pos, int data){

        int size = calcSize(head);
        int count = 0;
        
        if(pos==0)
        insertStart(head, data);
        
        if(pos<0 || pos > size)
        System.out.println("Invalid position");

        Node newnode = new Node(data);
        Node temp = head;

        while(count < pos){
            temp = temp.next;
            count++;
        }

        newnode.next = temp.next;
        temp.next = newnode;

        return head;
    }

    public int calcSize(Node node){
        int size = 0;
        while(node != null){
            node = node.next;
            size++;
        }
        return size;
    }

    static void display(Node head){
        Node node = head;
        Node temp = head;
        Node prev = null;
        System.out.println("In ascending order: ");
        while(node != null){
            System.out.print(node.data + " ");
            prev = node;
            temp = temp.next;
            temp.next = prev;
            node = node.next;
        }

        System.out.println("In reverse: ");
        while(temp.next != null){
            System.out.print(temp.data + "");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertLast(head, 4);
        head = insertLast(head, 8);
        head = insertLast(head, 5);
        head = insertLast(head, 2);
        head = insertLast(head, 2);
        head = insertLast(head, 10);

        display(head);
    }
}
