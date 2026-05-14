// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Input:
// "(()())"
// Output:
// true
// Input:
// "(()"
// Output:
// false

import java.util.*;

class Main {
    static void stack(String a){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='('){
                stack.push(a.charAt(i));
            }else if(a.charAt(i)==')'){
                if(stack.isEmpty()==true){
                    System.out.println("false");
                    return;
                }else{
                    stack.pop();
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
    public static void main(String[] args) {
        String s = "(()())";
        String t = "(()";
        String u = ")";
        
        stack(s);
        stack(t);
        stack(u);
    }
}
