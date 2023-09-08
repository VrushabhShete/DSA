class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        prev = null;
        next = null;
    }
}

public class DeletionDoublyLinkedList {
    
    static Node insert(Node head, int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return head;
        }
        head.prev = newnode;
        newnode.next = head;
        head = newnode;

        return head;
    }

    static void display(Node head){
        Node end = null;
        Node temp = head;

        System.out.println("List in forward direction");
        while(temp != null){
            System.out.print(temp.data + " ");
            end = temp;
            temp = temp.next;
        }
        System.out.println("\nList in backward direction");
        while(end != null){
            System.out.print(end.data + " ");
            end = end.prev;
        }
    }

    static Node delete(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 3);
        head = insert(head, 5);
        head = insert(head, 7);
        head = insert(head, 9);

        head = delete(head, 5);

        display(head);
    }
}
