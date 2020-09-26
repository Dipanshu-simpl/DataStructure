/* Find an element in a rotated sorted array*/
import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
    
    static int finAns(int arr[],int start,int end,int x)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x)
            {
                start=mid+1;
            }
            else if(x<arr[mid])
            {
                end=mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        int a[]={11,12,15,18,2,5,6,8};
        int min=a[0];
        int index=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
                index=i;
            }
        }
        int left=finAns(a,0,index,15);
        int right=finAns(a,index,a.length-1,15);
        
        System.out.println(left+"  "+right);
        if(left==-1 && right==-1)
        {
            System.out.println("Element not found");
        }
        else if(left==-1)
        {
            System.out.println(right);
        }
        else if(right==-1)
        {
            System.out.println(left);
        }
    }
}
