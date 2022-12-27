package in.co.decimal.service;

import java.util.ArrayList;
import java.util.List;

class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class LeftViewOfBinaryTree {
    static int maxLevel = 0;
    public static void printLeftView(Node root, int level, List<Integer> result){
        if (root == null) {
            return;
        }

        if(maxLevel < level){
            result.add(root.data);
            maxLevel = level;
        }
        printLeftView(root.right, level+1, result);
        printLeftView(root.left, level+1, result);

    }

    public static void main(String[] args){
        Node root = new Node(3);
        root.left = new Node(7);
        root.left.left = new Node(9);
        root.left.right = new Node(5);
        root.left.right.left = new Node(12);
        root.left.right.right = new Node(10);
        List<Integer> result = new ArrayList<> ();
        printLeftView(root,1, result);

        for(Integer ele: result){
            System.out.print (ele+" ");
        }
    }
}
