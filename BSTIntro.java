import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
    
    public static class Node{
        
        int data;
        Node left;
        Node right;
        
        Node(int data,Node left, Node right)
        {
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    
    public static class Pair{
     
     Node node;
     int state;
     
     Pair(Node node,int state)
     {
         this.node=node;
         this.state=state;
     }
    }
    
    // Displaying the tree.
    
    
    public static void display(Node node)
    {
        if(node==null)
        
        {
            return ;
        }
        
        
        String str="";
        
        str+=node.left==null?".": node.left.data +"";
        str+="<-"+node.data+"->";
        str+=node.right==null?".":node.right.data +"";
        System.out.println(str);
        
        display(node.left);
        display(node.right);
    }

     /* size of te tree*/
    
    
    public static int size(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        
        int ls=size(node.left);
        int rs=size(node.right);
        int ts=ls+rs+1;
        return ts;
        
    }
    
    /* Sum of nodes*/
    
    public static int sum(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        
        int lts=sum(node.left);
        int rts=sum(node.right);
        int tsm=lts+rts+node.data;
        return tsm;
    }
    
    
    /* Max node of the tree*/
    
    public static int max(Node node)
    {
        if(node==null)
        {
            return Integer.MIN_VALUE;
        }
        int ltm=max(node.left);
        int rtm=max(node.right);
        
        
        int tm=Math.max(node.data,Math.max(ltm,rtm));
        return tm;
    }

    public static void main(String args[])
    {
        Integer arr[]={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        
        Stack<Pair> ss=new Stack<>();
        
        
        Node root=new Node(arr[0],null,null);
        
        Pair rt=new Pair(root,1);
        ss.push(rt);
        
        int idx=0;
        
        while(!ss.isEmpty())
        {
            
            Pair top=ss.peek();
            if(top.state==1)
            {
                top.state++;
                idx++;
                if(arr[idx]!=null)
                {
                    top.node.left=new Node(arr[idx],null,null);
                    
                    Pair lp=new Pair(top.node.left,1);
                    ss.push(lp);
                }
                else
                {
                    top.node.left=null;
                }
            }
             else if(top.state==2)
            {
                 top.state++;
                idx++;
                if(arr[idx]!=null)
                {
                    top.node.right=new Node(arr[idx],null,null);
                    
                    Pair rp=new Pair(top.node.right,1);
                    ss.push(rp);
                }
                else
                {
                    top.node.right=null;
                }
               
            }
            else
            {
                ss.pop();
            }
        }
        
        display(root);
    }
    
}
