import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int[] array,frequency;
        int n,i,maxIndex,maxFrequency = 0,mode = 0;
        double median,mean = 0;
        frequency = new int[100001];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        array = new int[n];
        for(i=0; i<n; i++)
            array[i] = scanner.nextInt();
        scanner.close();
        Arrays.sort(array);
        for(i = 0; i < n; i++){
            mean = mean + array[i];
            frequency[array[i]]++;
        }
        mean = mean/n;
        if(n%2 != 0)
            median = array[n/2];
        else
            median = (double)(array[n/2 - 1] + array[n/2])/2;
        
        
        for(i = 0; i < 100001; i++)
            if(frequency[i] > maxFrequency){
                maxFrequency = frequency[i];
                mode = i;
            }
        System.out.printf("%.1f\n",mean);
        System.out.printf("%.1f\n",median);
        System.out.println(mode);
    }

}