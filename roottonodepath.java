import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
    
    public static class Node{
        
        int data;
        Node left;
        Node right;
        
        Node(int data,Node left,Node right)
        {
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    
    public static class Pair {
        
         Node node;
         int state;
         
         Pair(Node node,int state)
         {
             this.node=node;
             this.state=state;
         }
    }
    
    
    /* Display Function*/
    
    public static void display(Node node)
    {
        
        if(node==null)
        return ;
        
        String str="";
        
        str+=node.left==null?".":node.left.data+" ";
        str+="<-"+node.data+"->";
        str+=node.right==null?".":node.right.data;
        
        System.out.println(str);
        
        
        display(node.left);
        display(node.right);
        
    }
    
   
   /* Root to node path exists or not*/
   static ArrayList<Integer> arl;
   public static boolean find(Node node,int data)
   {
       
       
       if(node==null)
       {
           return false;
       }
       
       if(node.data==data)
       {
           arl.add(node.data);
           return true;
       }
       
       boolean filc=find(node.left,data);
       if(filc)
       {
           arl.add(node.data);
           return true;
       }
       
       boolean firc=find(node.right,data);
       if(firc)
       {
        arl.add(node.data);
       return true;
       }
       
       return false;
   }
 
    public static void main(String args[])
    {
        
        Integer arr[]={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        
        Stack<Pair> ss=new Stack<>();
        
        Node root=new Node(arr[0],null,null);
        
        Pair rt=new Pair(root,1);
        
        ss.push(rt);
        
        int idx=0;
        while(ss.size()>0)
        {
            
            Pair top=ss.peek();
            
            if(top.state==1)
            {
                
                idx++;
                top.state++;
                
                if(arr[idx]!=null)
                {
                    top.node.left=new Node(arr[idx],null,null);
                    
                    Pair lt=new Pair(top.node.left,1);
                    
                    ss.push(lt);
                    
                }
                else
                {
                    top.node.left=null;
                }
            }
            else if(top.state==2)
            {
                idx++;
                top.state++;
                
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
        /*Calling the display function here*/
        display(root);
        
        
        boolean result=find(root,50);
        System.out.println(result);
        
        arl=new ArrayList<>();
        System.out.println(arl);
    }
    
}
