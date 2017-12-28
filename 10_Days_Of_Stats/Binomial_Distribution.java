import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        int k;
        double boys,girls,bProb,gProb,sumProb = 0;
        Scanner scanner = new Scanner(System.in);
        boys = scanner.nextDouble();
        girls = scanner.nextDouble();
        bProb = boys/(boys + girls);
        gProb = 1 - bProb;


        for(k = 3; k <= 6; k++){
            sumProb += nChooseK(6,k)*(Math.pow(bProb,k))*(Math.pow(gProb,6-k));
        }
            
        System.out.printf("%.3f\n",sumProb);
        
    }
    
    private static double nChooseK(int n,int k){
        
        return (double)factorial(n)/(factorial(k)*factorial(n-k));
    }
    private static int factorial(int n){
        int factorial=1,i;
        for(i = 1; i <= n; i++)
            factorial = factorial*i;
        
        return factorial;
    }
    
    
}