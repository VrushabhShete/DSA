import java.util.*;
import java.io.*;
import java.lang.*;

class Node  
{ 
  int data; 
  Node left; 
  Node right; 
  Node(int val){
      data=val;
      left=right=null;
  }
}


class Tree { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
        System.out.println("Inorder");
    	inorder(root);
        System.out.println("\nPreorder");
        preorder(root);
        System.out.println("\nPostorder");
        postorder(root);
    } 
    
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);    
        }
    } 

    public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right); 
            System.out.print(root.data+" ");   
        }
    }

    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);    
        }
    }
}