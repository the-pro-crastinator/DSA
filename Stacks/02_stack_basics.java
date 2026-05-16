import java.util.*;

class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(15);
        stack.push(25);

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack);
    }
}
