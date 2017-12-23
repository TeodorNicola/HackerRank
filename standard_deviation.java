import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n,i;
        double mean=0,sum=0;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        array = new int[n];
        for(i=0; i<n; i++){
            array[i] = scanner.nextInt();
            mean += array[i];
        }
        mean = mean/n;
        for(i = 0;i < n;i++){
            sum += Math.pow(array[i] - mean,2);
        }
        sum = sum/n;
        System.out.printf("%.1f\n",Math.sqrt(sum));
        
    }
}