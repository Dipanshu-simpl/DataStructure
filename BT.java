
import java.io.*;
import java.util.*;
import java.lang.*;
class Node{
    int data;
    Node left;
    Node right;
}

class BinaryTree
{
    public Node createNode(int val)
    {
        Node a=new Node();
        a.data=val;
        a.left=null;
        a.right=null;
        return a;
    }
    
    public int getSumOfAllNode(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        
        return node.data+getSumOfAllNode(node.left)+getSumOfAllNode(node.right);
    }
    public int getdifferenceOddEvenLevelValues(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        
        return node.data-getdifferenceOddEvenLevelValues(node.left)-getdifferenceOddEvenLevelValues(node.right);
    }
    
    public int getNoOfNodes(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        
        return 1+getNoOfNodes(node.left)+getNoOfNodes(node.right);
    }
    
    // Get the number of leaf nodes.
    public int getNoOfLeafNodes(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        if(node.left==null && node.right==null)
        {
            return 1;
        }
        
        return getNoOfLeafNodes(node.left)+getNoOfLeafNodes(node.right);
    }
    
    
    
}
class BinaryTreeApp
{
    public static void main(String args[])
    {
        BinaryTree bb=new BinaryTree();
        Node root=bb.createNode(2);
        root.left=bb.createNode(7);
        root.right=bb.createNode(4);
        root.left.left=bb.createNode(8);
        root.left.right=bb.createNode(11);
        root.right.right=bb.createNode(10);
        root.left.left.left=bb.createNode(15);
        
        System.out.println(bb.getSumOfAllNode(root));
        System.out.println(bb.getdifferenceOddEvenLevelValues(root));
        System.out.println("No of nodes in the tree given below:::");
        System.out.println(bb.getNoOfNodes(root));
        System.out.println(bb.getNoOfLeafNodes(root));
    }
}