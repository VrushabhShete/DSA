class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        prev = next = null;
        this.data = data;
    }
}

public class LeftMostNode {

    int maxindex = 0;

    void printLeft(Node root, int current){
        if(root == null)
        return;

        if(maxindex < current){
            System.out.print(root.data + " ");
            maxindex++;
        }
        printLeft(root.left, current + 1);
        printLeft(root.right, current + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        LeftMostNode ln = new LeftMostNode();
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        ln.printLeft(root, 1);
    }
}
