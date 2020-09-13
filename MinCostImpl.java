// Connecting ropes to minimise the cost.

import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        
        int resultminCost=0;
        
        PriorityQueue<Integer> pqueue=new PriorityQueue<>();
        
        for(int i=0;i<arr.length;i++)
        {
            pqueue.add(arr[i]);
        }
    //    System.out.println(resultminCost);
    
    int cost=0;
    int second=0;
    while(pqueue.size()>1)
    {
        int first=pqueue.peek();
        pqueue.poll();
        
        if(pqueue.size()>0)
        {
        second=pqueue.peek();
        }
        
        pqueue.poll();
        
        
        cost=cost+first+second;
        
        pqueue.add(first+second);
    }
    System.out.println(cost);
    }
}
