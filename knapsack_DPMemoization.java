/* Knapsack 0-1  using DP(Memoization)*/

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
       
        int ans[][]=new int[n+1][w+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<w+1;j++)
            {
                ans[i][j]=-1;
            }
        }
       
        if(n==0 || w==0)
        {
            return 0;
        }
        if(ans[n][w]!=-1)
        {
            return ans[n][w];
        }
        if(wt[n-1]<=w)
        {
            ans[n][w]= max(val[n-1]+knapsack(wt,val,w-wt[n-1],n-1),knapsack(wt,val,w,n-1));
        }
        else
        {
            ans[n][w]=knapsack(wt,val,w,n-1);
        }
        return ans[n][w];
    }
}
