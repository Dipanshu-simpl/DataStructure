/* Knapsack 0-1  using Recusrion*/

import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
   
    public static void main(String args[])
    {
        int wt[]={10,20,30};
        int val[]={60,100,120};
        int w=50;
        int n=wt.length;
        int result=knapsack(wt,val,w,n);
        System.out.println(result);
    }
   
    public static int max(int a,int b)
    {
        if(a>b)
        return a;
       
        return b;
    }
    public static int knapsack(int wt[],int val[],int w,int n)
    {
        if(n==0 || w==0)
        {
            return 0;
        }
        if(wt[n-1]<=w)
        {
            return max(val[n-1]+knapsack(wt,val,w-wt[n-1],n-1),knapsack(wt,val,w,n-1));
        }
        else
        {
            return knapsack(wt,val,w,n-1);
        }
    }
}


