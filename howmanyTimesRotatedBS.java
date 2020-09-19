/* How many times array is rotated*/

import java.io.*;
import java.util.*;
import java.lang.*;
class RotatedHowTimes
{
    static int countTimes(int arr[],int N)
    {
            int start=0;
        int end=arr.length-1;  
        
        
        while(start<=end)
        {
            
        
            int mid=start+(end-start)/2;
            
            int prev=(mid+N-1)%N;
            int next=(mid+1)%N;
            
            if(arr[start]<=arr[end])
            {
                return start;
            }
            
            
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
            {
                return mid;
            }
            else if(arr[start]<=arr[mid])
            {
                start=mid+1;
            }
            else if(arr[mid]<=arr[end])
            {
                end=mid-1;
            }
            
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        int a[]={12,15,18,2,5,6,8,11};
        int n=8;
        
        
        int result=countTimes(a,n);
            System.out.println("Array is rotated "+ result);
    }
}
