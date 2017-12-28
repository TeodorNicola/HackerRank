import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int trials,trial;
        double numerator,denominator,defect,answer=0;
        Scanner scanner = new Scanner(System.in);
        numerator = scanner.nextDouble();
        denominator = scanner.nextDouble();
        trials = scanner.nextInt();
        defect = numerator/denominator;
        for(trial = 1; trial <= trials; trial++)
            answer += Math.pow(1-defect,trial-1)*defect;
        System.out.printf("%.3f\n",answer);
        
    }
}