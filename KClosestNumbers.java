/* K Closest elements*/
import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
    public static void main(String args[])
    {
        
        PriorityQueue<Integer> pqueue=new PriorityQueue<>(Collections.reverseOrder());
        int k=3;// Size of the heap 
        int x=7;// closest w.r.t to this element.
        
        ArrayList<Integer> arl=new ArrayList<>();
        
        int arr[]={5,6,7,8,9};
        
        ArrayList<Integer> arl2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            arl.add(Math.abs(arr[i]-x));
            
            pqueue.add(Math.abs(arr[i]-x));
            if(pqueue.size()>k)
            {
                pqueue.poll();
            }
        }
        while(!pqueue.isEmpty())
        {
            arl2.add(pqueue.poll());
        }
        ArrayList<Integer> arl3=new ArrayList<>();
        //System.out.println(arl);
        //System.out.println(arl2);
        for(int i=0;i<arl.size();i++)
        {
            if(arl2.contains(arl.get(i)))
            {
                arl3.add(arr[i]);
                //arl.remove(arl.get(i));
            }
        }
        System.out.println(arl3);
    }
}
