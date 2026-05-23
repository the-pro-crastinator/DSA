// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [4, 8, 5, 2, 25]
// next smaller element for every number
// 4  -> 2
// 8  -> 5
// 5  -> 2
// 2  -> -1
// 25 -> -1

import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        int arr[] = {4,8,5,2,25};
        // [4, 8, 5, 2, 25]
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                if(stack.peek()>=arr[i]){
                    while(!stack.isEmpty() && stack.peek()>=arr[i]){
                        stack.pop();
                    }
                    if(!stack.isEmpty()){
                        System.out.println(arr[i] + "->" + stack.peek());
                    }else{
                        System.out.println(arr[i] + "->" + -1);
                    }
                    stack.push(arr[i]);
                }else{
                    System.out.println(arr[i] + "->" + stack.peek());
                stack.push(arr[i]);
                }
            }else{
                System.out.println(arr[i] + "->" + -1);
                stack.push(arr[i]);
            }
        }
    }
}
