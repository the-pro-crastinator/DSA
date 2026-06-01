// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// FRONT -> 10 20 30 40 50
// FRONT -> 50 40 30 20 10

import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        Stack<Integer>stack = new Stack<>();
        
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        
        System.out.println(q);
        
        while(!q.isEmpty()){
            stack.push(q.poll());
        }
        
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }
        
        System.out.print(q);
    }
}
