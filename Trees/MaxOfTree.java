class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class MaxOfTree {

    static int findMax(Node a){
        
        if(a.left == null && a.right == null)
        int max = a.data;
        else{
            if(a.data > a.left.data && a.data > a.right.data)
            return a.data;
            else if(a.left.data > a.data && a.left.data > a.right.data)
            return a.left.data;
            else return a.right.data;
        }
        findMax(a.left);
        findMax(a.right);
        
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        findMax(root);
    }
}
