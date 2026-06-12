// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// enqueue(10)
// enqueue(20)
// enqueue(30)

// dequeue()  -> 10

// enqueue(40)

// dequeue()  -> 20

// peek()     -> 30

import java.util.*;

class Main {
    
    static void enqueue(Stack<Integer> s1, int x){
        s1.push(x);
    }
    
    static void dequeue(Stack<Integer> s1, Stack<Integer> s2){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        
        System.out.println(s2.pop());
        
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    static void peek(Stack<Integer> s1, Stack<Integer> s2){
        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        
        System.out.println(s2.peek());
        
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s1 = new Stack<>();
        Stack<Integer>s2 = new Stack<>();
        
        enqueue(s1,10);
        enqueue(s1,20);
        enqueue(s1,30);
        dequeue(s1,s2);
        enqueue(s1,40);
        dequeue(s1,s2);
        peek(s1,s2);
    }
}
