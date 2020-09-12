/* Kth smallest element using Heapify*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static void main(String args[])
    {
        int arr[]={7,10,4,3,20,15};
        
        /* K is given as 3 means 3rd smallest element*/
        int k=3;
        
        
        /* Implementing using priority queue*/
        
        PriorityQueue<Integer> pqueue=new PriorityQueue<>(Collections.reverseOrder());
        
        /*Traversing array and putting element yo heap*/
        
        
        for(int i=0;i<arr.length;i++)
        {
            pqueue.add(arr[i]);
            
            if(pqueue.size()>k)
            {
                pqueue.poll();
            }
        }
        System.out.println(pqueue.peek());
    }
}
