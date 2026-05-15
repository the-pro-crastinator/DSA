// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [2, 1, 3, 5, 4]
// next greater element for every number
// 2 -> 3
// 1 -> 3
// 3 -> 5
// 5 -> -1
// 4 -> -1

import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 5, 4};
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                System.out.println(arr[i] + "->" + -1);
                stack.push(arr[i]);
            }else{
                if(stack.peek()<arr[i]){
                while(!stack.isEmpty() && stack.peek()<arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    System.out.println(arr[i] + "->" + -1);
                    stack.push(arr[i]);
                }else{
                    System.out.println(arr[i] + "->" + stack.peek());
                    stack.push(arr[i]);
                }
            }else{
                System.out.println(arr[i] + "->" + stack.peek());
                stack.push(arr[i]);
            }
            }
        }
    }
}
