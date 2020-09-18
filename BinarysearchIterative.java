import java.io.*;
import java.util.*;
import java.lang.*;
class BinarySearch
{
    static int binarySearch(int arr[],int x)
    {
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(x==arr[mid])
            {
                return mid;
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
         return -1;
    }
    
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int result=binarySearch(a,4);
        
        if(result==-1)
        {
            System.out.println("Element not present");
        }
        else
        {
            System.out.println("Element present at "+result);
        }
        
    }
}
