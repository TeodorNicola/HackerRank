import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n,i;
        int Q3,Q2,Q1;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        array = new int[n];
        for(i=0; i<n; i++)
            array[i] = scanner.nextInt();
        scanner.close();
        
        Arrays.sort(array);
        if(n%2 != 0)
            Q2 = array[n/2];
        else
            Q2 = Math.round((array[n/2 -1] +array[n/2])/2);
        if(n/2 % 2 == 0){
            int mid = calculateMid(0,n/2 -1);
            Q1 = (array[mid] + array[mid + 1])/2;
            mid = calculateMid((n+1)/2, n-1);
            Q3 = (array[mid] + array[mid + 1])/2;
        }
        else{
            Q1 = array[n/4];
            Q3 = array[n/4 + n/2];
        }
        

       System.out.println(Q1);
       System.out.println(Q2);
       System.out.println(Q3);
    }
    
      private static int calculateMid(int start, int end) {
          return (start + end)/2;
    }
    
    
}