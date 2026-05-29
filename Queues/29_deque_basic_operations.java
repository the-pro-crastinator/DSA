// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 1. addFirst(10)
// 2. addLast(20)
// 3. addLast(30)
// 4. print deque
// 5. removeFirst()
// 6. print deque
// 7. addFirst(5)
// 8. removeLast()
// 9. print front element
// 10. print rear element
// 11. print whole deque

import java.util.*;

class Main {
    public static void main(String[] args) {
        Deque<Integer>dq = new LinkedList<>();
        dq.addFirst(10);
        dq.addLast(20);
        dq.addLast(30);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.addFirst(5);
        dq.removeLast();
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq);
    }
}
