import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int trials;
        double numerator,denominator,defect,answer;
        Scanner scanner = new Scanner(System.in);
        numerator = scanner.nextDouble();
        denominator = scanner.nextDouble();
        trials = scanner.nextInt();
        defect = numerator/denominator;
        answer = Math.pow(1-defect,trials-1)*defect;
        System.out.printf("%.3f\n",answer);
        }
}