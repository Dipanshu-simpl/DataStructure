/* 0-1 knapsack using DP(top-down)*/

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
        System.out.println("max profit is:- "+result );
    }
   
   
    static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }
    public static int knapsack(int wt[],int val[],int w,int n)
    {
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<w+1;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                }
                else if(wt[i-1]<=j)
                {
                    dp[i][j]=max(val[i-1]+(dp[i-1][j-wt[i-1]]),dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
               
            }
        }
        return dp[n][w];
    }
}
