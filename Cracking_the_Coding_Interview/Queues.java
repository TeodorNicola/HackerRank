import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static class MyQueue<Integer>{
        
        private Stack<Integer> pushStack = new Stack<Integer>();
        private Stack<Integer> popStack = new Stack<Integer>();

        public void enqueue(Integer x){
            pushStack.push(x);
        }
    
        public Integer dequeue(){
            if(popStack.isEmpty())
                while(!pushStack.isEmpty())
                    popStack.push(pushStack.pop());
            
            return popStack.pop();
        }
        
            public Integer peek(){
            if(popStack.isEmpty())
                while(!pushStack.isEmpty())
                    popStack.push(pushStack.pop());
            
            return popStack.peek();
        }
    }
    
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

