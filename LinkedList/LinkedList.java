class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    static Node head;
    
    public Node insertStart(int data){
        Node newnode = new  Node(data);
        newnode.next = head;
        head = newnode;
        return head;
    }

    public void insertLast(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }

        Node temp = head;

        while(temp.next != null)
        temp = temp.next;
        
        temp.next = newnode;

    }

    public void insertAtPosition(int pos, int data){

        int size = calcSize(head);
        int count = 0;
        
        if(pos==0)
        insertStart(data);
        
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
    }

    public int calcSize(Node node){
        int size = 0;
        while(node != null){
            node = node.next;
            size++;
        }
        return size;
    }

    public void display(){
        Node node = head;

        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertStart(4);
        ll.insertStart(8);
        ll.insertLast(5);
        ll.insertLast(2);
        ll.insertLast(2);
        ll.insertLast(10);
        ll.insertAtPosition(1, 6);
        ll.display();
    }
}
