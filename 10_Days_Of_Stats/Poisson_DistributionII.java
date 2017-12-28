import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        double meanA,meanB,expectedA,expectedB;
        Scanner scanner = new Scanner(System.in);
        meanA = scanner.nextDouble();
        meanB = scanner.nextDouble();
        expectedA = 160 + 40*(meanA + Math.pow(meanA,2));
        expectedB = 128 + 40*(meanB + Math.pow(meanB,2));
        System.out.printf("%.3f\n",expectedA);
        System.out.printf("%.3f\n",expectedB);

    }
}