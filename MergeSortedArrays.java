import java.io.*;
import java.lang.*;
import java.util.*;
class Main{
    public static void main(String args[])
    {
        /* Taking a input 2D Arrays*/
        int c[][]={{1,4,7},
                   {2,5,8},
                   {3,6,9}};

        /*k refers to the no of arrays*/                       
        int k=c.length;
        
        /*l refers to the length of each array, assuming arrays of same length*/
        
        int l=c[0].length;
        int ans[]=new int[k*l];
        ans=mergeArrays(c,k,l);
        int finaArr[]=new int[ans.length];
        finaArr=sortedArrays(ans);
        for(int i=0;i<finaArr.length;i++)
        {
            System.out.print(finaArr[i]+"  ");
        }
    }
    static int[] mergeArrays(int c[][],int m,int n)
    {
        int fin[]=new int[m*n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                fin[i*n+j]=c[i][j];
            }
        }
      return fin; 
    }
    static int[] sortedArrays(int sor[])
    {
        Arrays.sort(sor);
        return sor;
    }
}
