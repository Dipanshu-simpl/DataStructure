/* K- Closest point to origin*/

import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
    public static void main(String args[])
    {
        PriorityQueue<Map.Entry<Integer,Integer>> pqueue=new PriorityQueue<>((a, b)->b.getValue()-a.getValue());
       // pqueue.add(2,3);
        
       Map<Integer,Integer> hmap=new HashMap<>();
       
       hmap.put(2,3);
       hmap.put(5,6);
       for(Map.Entry<Integer,Integer> entry:hmap.entrySet())
       {
           pqueue.add(entry);
       }
       
       System.out.println(pqueue);
       pqueue.poll();
       System.out.println(pqueue);
    }
}
