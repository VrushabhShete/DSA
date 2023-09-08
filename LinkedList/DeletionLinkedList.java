class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class DeletionLinkedList {

    static Node insert(Node head, int data){
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

    static void display(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static Node delete(Node head, int pos){
        Node temp = head;
        Node previous = null;
        int count = 0;
        
        if(head == null)
        System.out.println("Empty list");

        if(temp != null && count == pos){
            head = temp.next;
            System.out.println("Deleted " + temp.data);
            return head;
        }

        while(temp != null && count < pos){
            count++;
            previous = temp;
            temp = temp.next;
        }

        if(temp == null)
        System.out.println("Empty list");

        previous.next = temp.next;
        System.out.println("Value deleted " + temp.data);
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 4);
        head = insert(head, 6);
        head = insert(head, 5);
        head = insert(head, 3);
        head = insert(head, 9);
        head = delete(head, 1 );

        display(head);
    }
}
