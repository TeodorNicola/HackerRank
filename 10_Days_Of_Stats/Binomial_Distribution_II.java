import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int k,batch;
        double working,defective,firstAnswer=0,secondAnswer=0;
        Scanner scanner = new Scanner(System.in);
        defective = scanner.nextDouble();
        batch = scanner.nextInt();
        defective = defective/100;
        working = 1 - defective;

        for(k = 0; k <= 2; k++){
            firstAnswer += nChooseK(batch,k)*(Math.pow(defective,k))*(Math.pow(working,batch-k));
        }
        
        for(k = 0; k <= 1; k++){
            secondAnswer += nChooseK(batch,k)*(Math.pow(defective,k))*(Math.pow(working,batch-k));
        }
        
        secondAnswer = 1 - secondAnswer;
        
        
        System.out.printf("%.3f\n",firstAnswer);
        System.out.printf("%.3f\n",secondAnswer);
        
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