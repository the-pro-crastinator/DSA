// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// enqueue(10)
// enqueue(20)
// enqueue(30)

// dequeue()  -> should return 10

// enqueue(40)

// dequeue()  -> should return 20

// peek()     -> should return 30

import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<Integer>s1 = new Stack<>();
        Stack<Integer>s2 = new Stack<>();
        
        s1.push(10);
        s1.push(20);
        s1.push(30);
        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        
        s2.pop();
        
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        
        s1.push(40);
        
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        
        s2.pop();
        System.out.println(s2.peek());
    }
}
