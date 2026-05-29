// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 1. add 10
// 2. add 20
// 3. add 30
// 4. print front element
// 5. remove one element
// 6. print front element again
// 7. print whole queue
// 8. check if queue is empty

import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println("Is the Queue empty: " + q.isEmpty());
    }
}
