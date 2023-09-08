import java.lang.*;

class Node{
  
    int data;
    Node next;
    Node prev;
 
    Node (int x) 
    {
        data = x;
        next = null;
        prev = null;
    } 
} 
class DoublyLinkedList{
  
    static Node insertStart (Node head, int data) 
    {
    
        Node newNode = new Node (data);
        newNode.next = head;
        //If the linked list already had atleast 1 node
        if (head != null)
            head.prev = newNode;
 
        //changing the new head to this freshly entered node
        head = newNode;
        return head;
    }
 
    static void display (Node node) 
    {
        //as linked list will end when Node is Null
        Node end = null;
 
        System.out.println ("List in forward direction");
        while (node != null)
        {
            System.out.print (node.data + " ");
            end = node;
            node = node.next;
        }
        System.out.println ("\nList in backward direction");
        while (end != null)
        {
            System.out.print (end.data + " ");
            end = end.prev;
        }
    }
 
    static Node insertLast (Node head, int data)
    {
        Node newNode = new Node (data);
        //need this if there is no node present in linked list at all
        if (head == null)
        {
            head = newNode;
            newNode.prev = null;
            return head;
        }
        Node temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
 
    public static void main (String args[]) 
    {
        Node head = null;
        head = insertStart (head, 12);
        head = insertStart (head, 16);
        head = insertStart (head, 20);
        head = insertStart (head, 24);
        head = insertLast (head, 30);
        head = insertLast (head, 22);
 
        display (head);
    } 
}