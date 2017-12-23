import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Map<String, Integer> wordFrequency = new HashMap<String, Integer>();
        Integer frequency;
        Boolean untraceable = true;
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
            frequency = wordFrequency.get(magazine[magazine_i]);
            if (frequency == null) {
                    wordFrequency.put(magazine[magazine_i], 1);
            } else {
            wordFrequency.put(magazine[magazine_i], frequency+1);
            }
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
            frequency = wordFrequency.get(ransom[ransom_i]);
            if (frequency == null || frequency <=0) {
                    untraceable = false;
            } else {
            wordFrequency.put(ransom[ransom_i], frequency-1);
            }
        }
        if(untraceable)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}

