// arr:6 2 5 4 5 1 6

import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
    public static void main(String args[]) throws IOException
    {
        int n,i,j;
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //n=Integer.parseInt(br.readLine());
        Stack<Integer> ss=new Stack<>();
        Stack<Integer> ss2=new Stack<>();
        ArrayList<Integer> arl2=new ArrayList<>();
        ArrayList<Integer> arl=new ArrayList<>();
            s=br.readLine();
            String[] ss1=s.split(" ");
            int a[]=new int[ss1.length];
            int b[]=new int[a.length];
            int area[]=new int[b.length];
            for(i=0;i<a.length;i++)
            {
                a[i]=Integer.parseInt(ss1[i]);
            }
        
        // NSL.
        for(i=0;i<a.length;i++)
        {
            if(ss.isEmpty())
            {
                arl.add(-1);
               // arl2.add(-1);
            }
            else if(!ss.isEmpty() && a[i]>a[ss.peek()])
            {
                arl.add(ss.peek());
            }
            else if(!ss.isEmpty() && a[i]<=a[ss.peek()])
            {
                while(!ss.isEmpty() && a[i]<=a[ss.peek()])
                {
                    ss.pop();
                }
                if(ss.isEmpty())
                {
                    arl.add(-1);
                }
                else
                {
                    arl.add(ss.peek());
                }
            }
            ss.push(i);
        }
        // NSR.
        for(i=a.length-1;i>=0;i--)
        {
            if(ss2.isEmpty())
            {
                arl2.add(a.length);
            }
            else if(!ss2.isEmpty() && a[i]>a[ss2.peek()])
            {
                arl2.add(ss2.peek());
            }
            else if(!ss2.isEmpty() && a[i]<=a[ss2.peek()])
            {
                while(!ss2.isEmpty() && a[i]<=a[ss2.peek()])
                {
                    ss2.pop();
                }
                if(ss2.isEmpty())
                {
                    arl2.add(a.length);
                }
                else
                {
                    arl2.add(ss2.peek());
                }
            }
            ss2.push(i);
        }
        System.out.println(arl);
        Collections.reverse(arl2);
        System.out.println(arl2);
        for(i=0;i<arl.size();i++)
        {
            b[i]=arl2.get(i)-arl.get(i)-1;
        }
        for(i=0;i<b.length;i++)
        {
           area[i]=a[i]*b[i];
        }
        Arrays.sort(area);
        System.out.println(area[area.length-1]);
    }
}
