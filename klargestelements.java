/* Finding the 3 laregest element using heap*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static void main(String args[])
    {
        /* Min heap*/
        PriorityQueue<Integer> pqueue=new PriorityQueue<>();
        
        int k=3;
        
        int arr[]={7,10,4,3,20,15};
        for(int i=0;i<arr.length;i++)
        {
            pqueue.add(arr[i]);
            if(pqueue.size()>k)
            {
                pqueue.poll();
            }
        }
        while(pqueue.size()!=0)
        {
            System.out.println(pqueue.peek());
            pqueue.poll();
        }
    }
}
