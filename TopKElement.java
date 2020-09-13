import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static void main(String args[])
    {
        PriorityQueue<Map.Entry<Integer,Integer>> pqueue=new PriorityQueue<>((a,b)-> a.getValue().equals(b.getValue())
                                                              ?Integer.compare(b.getKey(),a.getKey()): Integer.compare(b.getValue(),a.getValue()));
        
        int arr[]={1,2,3,3,2,2,4};
        
        int k=2;// returning top k elements with highest frequencies.
        
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
        System.out.println(hmap);
        
        for(Map.Entry<Integer,Integer> entry:hmap.entrySet())
        {
            pqueue.add(entry);
        }
        System.out.println(pqueue);
        for(int i=0;i<k;i++)
        {
            System.out.print(pqueue.poll().getKey()+"  ");
        }
    }
}
