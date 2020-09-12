/* K -sorted arrays/ nearly sorted arrays*/
import java.io.*;
import java.lang.*;
import java.util.*;
class Main{
    public static void main(String args[])
    {
        /* Min queue*/
        
        PriorityQueue<Integer> pqueue=new PriorityQueue<>();
        
        int arr[]={6,5,3,2,8,10,9};
        
        int k=3;
        
        ArrayList<Integer> arl=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            pqueue.add(arr[i]);
            if(pqueue.size()>k)
            {
                arl.add(pqueue.poll());
            }
        }
        while(!pqueue.isEmpty())
        {
            arl.add(pqueue.poll());
        }
        System.out.println(arl);
    }
}
