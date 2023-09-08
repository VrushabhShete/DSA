class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class PrintKLevel {

    static void printNodes(Node temp, int k, int count){
        
        if(count == k)
        System.out.print(temp.data + " ");
        else{
            printNodes(temp.left, k, count + 1);
            printNodes(temp.right, k, count + 1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);
        
        printNodes(root, 1, 0);
    }
}
