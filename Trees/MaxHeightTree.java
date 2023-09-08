class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class MaxHeightTree {

    static int maxHeight(Node temp){
        int leftheight, rightheight;
        if(temp == null)
        return 0;

        else{
            leftheight = maxHeight(temp.left);
            rightheight = maxHeight(temp.right);
        }
        if (leftheight > rightheight)
        return leftheight + 1;
        else
        return rightheight + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node (2);
        root.right = new Node (3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node (6);
        root.right.right = new Node (7);

        System.out.println("Max height is "+ maxHeight(root));
    }
}
