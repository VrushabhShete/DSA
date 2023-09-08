import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class SpiralOrderTraversal {

    static void spiralOrder(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.add(root);

        while(!s1.empty() || !s2.empty()){
        while(!s1.empty()){
            Node temp = s1.pop();
            System.out.print(temp.data + " ");

            if(temp.left != null)
            s2.add(temp.left);

            if(temp.right != null)
            s2.add(temp.right);
        }

        while(!s2.empty()){
            Node temp = s2.pop();
            System.out.print(temp.data + " ");

            if(temp.right != null)
            s1.add(temp.right);

            if(temp.left != null)
            s1.add(temp.left);            
        }
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

        spiralOrder(root);
    }
}
