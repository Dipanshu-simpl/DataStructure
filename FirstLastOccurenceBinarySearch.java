/* Ist and last occurence of an element using BinarySearch*/

import java.io.*;
import java.util.*;
import java.lang.*;
class FirstLastOcuurence
{
    static int firstOccurence(int a[],int x)
    {
        int start=0;
        int end=a.length-1;
        int res=-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(x==a[mid])
           {
             res=mid;
             end=mid-1;
           }
           else if(x<a[mid])
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
    /* Last occurence*/
    
    static int lastOccurence(int a[],int x)
    {
        int low=0;
        int high=a.length-1;
        
        int res1=-1;
        while(low<=high)
        {
            int mid1=low+(high-low)/2;
            
            if(x==a[mid1])
            {
                res1=mid1;
                low=mid1+1;
            }
            else if(x<a[mid1])
            {
                high=mid1-1;
            }
            else
            {
                low=mid1+1;
            }
        }
        return res1;
    }
         public static void main(String args[])
         {
            int arr[]={2,4,10,10,10,18,20};
            int x=10;
            
            int result= firstOccurence(arr,x);
            System.out.println("First occurence of "+ x+ " is at "+result);
           
           
            int result1=lastOccurence(arr,x);
            System.out.println("Last Occurence of "+x+ " is at "+result1);
          }
       }
