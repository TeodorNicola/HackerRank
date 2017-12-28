import java.io.*;
import java.util.*;

public class Solution {

    private static int factorial(int n){
        int factorial=1,i;
        for(i = 1; i <= n; i++)
            factorial = factorial*i;
        
        return factorial;
    }

    
    public static void main(String[] args) {
        int k;
        double mean,answer;
        Scanner scanner = new Scanner(System.in);
        mean = scanner.nextDouble();
        k = scanner.nextInt();
        answer = (Math.pow(mean,k)*Math.exp(mean*(-1)))/factorial(k);
        System.out.printf("%.3f\n",answer);
        
    }
}