import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] values,weight;
        int n,i,sum = 0;
        double weightedMean = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        values = new int[n];
        weight = new int[n];
        for(i=0; i<n; i++)
            values[i] = scanner.nextInt();
         for(i=0; i<n; i++)
            weight[i] = scanner.nextInt();
        scanner.close();
        for(i=0; i<n; i++){
           weightedMean += values[i]*weight[i];
           sum += weight[i];
        }
        weightedMean = (double)weightedMean/sum;
        System.out.printf("%.1f\n",weightedMean);
    }
}