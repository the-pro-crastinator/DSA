// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// push(10)
// push(20)
// push(30)

// pop()  -> 30

// push(40)

// pop()  -> 40

// top()  -> 20

import java.util.*;

class Main {
    
    static void push(Queue<Integer> q1, int x){
        q1.offer(x);
    }
    
    static void pop(Queue<Integer> q1, Queue<Integer> q2){
        while(q1.size()>1){
            q2.offer(q1.poll());
        }
        
        System.out.println(q1.poll());
        
        while(q2.size()>0){
            q1.offer(q2.poll());
        }
    }
    
    static void top(Queue<Integer> q1, Queue<Integer> q2){
        
        while(q1.size()>1){
            q2.offer(q1.poll());
        }
        
        System.out.println(q1.peek());
        int a = q1.peek();
        q1.poll();
        
        q2.offer(a);
        
        
        while(q2.size()>0){
            q1.offer(q2.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer>q1 = new LinkedList<>();
        Queue<Integer>q2 = new LinkedList<>();
        
        push(q1,10);
        push(q1,20);
        push(q1,30);
        pop(q1,q2);
        push(q1,40);
        pop(q1,q2);
        top(q1,q2);
    }
}
