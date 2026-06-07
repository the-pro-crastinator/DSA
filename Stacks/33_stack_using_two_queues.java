// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// push(10)
// push(20)
// push(30)

// pop()  -> 30

// push(40)

// pop()  -> 40

// peek() -> 20

import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        
        int m = q1.size();
        
        for(int i=0;i<m-1;i++){
            q2.offer(q1.poll());
        }
        
        System.out.println(q1.poll());
        
        q2.offer(40);
        
        int n = q2.size();
        
        for(int i=0;i<n-1;i++){
            q1.offer(q2.poll());
        }
        
        System.out.println(q2.poll());
        
        int o = q1.size();
        
        for(int i=0;i<o-1;i++){
            q2.offer(q1.poll());
        }
        
        System.out.println(q1.peek());
    }
}
