import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n,i,extendedLength = 0,k=0;
        double Q3,Q1;
        int[] array,frequency,extendedArray;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        array = new int[n];
        frequency = new int[n];
        for(i=0; i<n; i++)
            array[i] = scanner.nextInt();
        for(i=0; i<n; i++){
            frequency[i] = scanner.nextInt();
            extendedLength += frequency[i];
        }
        scanner.close();
        
        extendedArray = new int[extendedLength];
          
        for(i=0;i<n;i++)
            while(frequency[i] > 0){
                extendedArray[k++] = array[i];
                frequency[i]--;
            }
        
        Arrays.sort(extendedArray);

        if(extendedLength/2 % 2 == 0){
            int mid = calculateMid(0,extendedLength/2 -1);
            Q1 = (extendedArray[mid] + extendedArray[mid + 1])/2;
            mid = calculateMid((extendedLength+1)/2, extendedLength-1);
            Q3 = (extendedArray[mid] + extendedArray[mid + 1])/2;
        }
        else{
            Q1 = extendedArray[extendedLength/4];
            Q3 = extendedArray[extendedLength/4 + (extendedLength+1)/2];
        }
  
        System.out.printf("%.1f\n",Q3-Q1);
    }
    
      private static int calculateMid(int start, int end) {
          return (start + end)/2;
    }
}