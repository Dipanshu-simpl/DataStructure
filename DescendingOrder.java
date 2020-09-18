// Descending Sorted Array-BinarySearch
import java.io.*;
import java.util.*;
import java.lang.*;
class BinarySearchSortedArray
{

  static int sortsArray(int a[],int x)
  {
      int start=0;
      int end=a.length-1;
      
      while(start<=end)
      {
          int mid=start+(end-start)/2;
          if(x==a[mid])
          {
              return mid;
          }
          else if(x<a[mid])
          {
              start=mid+1;
          }
          else
          {
              end=mid-1;
          }
      }
      return -1;
  }
  public static void main(String args[])
  {
      int arr[]={20,10,8,7,6,5,4,3};
      int result=sortsArray(arr,63);
      
      if(result==-1)
      {
          System.out.println("Element not found");
      }
      else
      {
          System.out.println("Element found at "+result);
      }
  }
}
