/* Frequency Sort*/

import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
    public static void main(String args[])
    {
        
        // PriorityQueue
        
        PriorityQueue<Map.Entry<Integer,Integer>> pqueue=new PriorityQueue<>((a,b)->a.getValue().equals(b.getValue())
                                                             ? Integer.compare(b.getKey(),a.getKey()):
                                                             Integer.compare(b.getValue(),a.getValue()));
        
        int arr[]={1,1,1,3,2,2,4};
        
        Map<Integer,Integer> hmap=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(hmap.containsKey(arr[i]))
            {
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else
            {
                hmap.put(arr[i],1);
            }
        }
        // Inserting values into the Heap 
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet())
        {
            pqueue.add(entry);
        }
        System.out.println(pqueue);
        while(pqueue.size()>0)
        {
            int val=pqueue.peek().getKey();
            int freq=pqueue.peek().getValue();
            for(int i=0;i<freq;i++)
            {
                System.out.print(val+"  ");
            }
            
            pqueue.poll();
        }
    }
}
