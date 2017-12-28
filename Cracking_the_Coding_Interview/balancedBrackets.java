import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> balanceStack = new Stack<Character>();
       for(int i =0; i< expression.length(); i++){
           char c = expression.charAt(i);
           if(c == '{' || c == '(' || c == '['){
                 balanceStack.push(c);
           }
            else
           {
              if(balanceStack.isEmpty())
                return false;
              char check = (char)balanceStack.pop();
              if(check == '(')
                check = ')';
              else if(check == '{')
                check = '}';
              else if(check == '[')
                check = ']';
              if(c != check)
                return false;
           }
                
      }
      return balanceStack.isEmpty();
       
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

