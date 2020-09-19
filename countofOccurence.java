/* Count the element in a sorted array*/

import java.io.*;
import java.util.*;
import java.lang.*;
class Countoccurence
{
    static int firstOccurence(int arr[],int x)
    {
        int start=0;
        int end=arr.length-1;
        
        int res=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(x==arr[mid])
            {
                res=mid;
                end=mid-1;
            }
            else if(x<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return res;
    }
    
    static int lastOccurence(int arr[],int x)
    {
        int start=0;
        int end=arr.length-1;
        
        int res=-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(x==arr[mid])
            {
                res=mid;
                start=mid+1;
            }
            else if(x<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return res;
    }
    
    public static void main(String args[])
    {
        int a[]={2,4,10,10,10,10,10,18,20};
        int x=10;
        
        int minoccur=firstOccurence(a,x);
        int maxoccur=lastOccurence(a,x);
        
        int count=maxoccur-minoccur+1;
        
        System.out.println(count);
    }
}
