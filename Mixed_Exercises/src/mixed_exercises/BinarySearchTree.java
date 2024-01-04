/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mixed_exercises;

/**
 *
 * @author PC
 */
public class BinarySearchTree {

    public static class Node{
        int data;
        Node left,right;
       
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public void insert(Node node,int data)
    {
        if(data < node.data)
        {
            if(node.left != null)
            {
                insert(node.left,data);
            }
            else
            {
               
                node.left = new Node(data);
            }
        }
        else if(data> node.data)
        {
            if(node.right != null)
            {
                insert(node.right,data);
            }
            else
            {
               
                node.right = new Node(data);
            }
        }
    }
    public Node root;
    public BinarySearchTree(){
        root = null;
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = new Node(5);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.data);
        
    }
    
}
