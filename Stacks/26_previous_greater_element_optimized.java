// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [10, 4, 2, 20, 40, 12, 30]
// previous greater element for every number
// 10 -> -1
// 4  -> 10
// 2  -> 4
// 20 -> -1
// 40 -> -1
// 12 -> 40
// 30 -> 40

import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        int arr[] = {10,4,2,20,40,12,30};
        // [10, 4, 2, 20, 40, 12, 30]
        for(int i=0;i<arr.length;i++){
            if(!stack.isEmpty()){
                if(stack.peek()>=arr[i]){
                    System.out.println(arr[i] + "->" + stack.peek());
                    stack.push(arr[i]);
                }else{
                    while(!stack.isEmpty() && stack.peek()<arr[i]){
                        stack.pop();
                    }
                    if(!stack.isEmpty()){
                        System.out.println(arr[i] + "->" + stack.peek());
                    }else{
                        System.out.println(arr[i] + "->" + -1);
                    }
                    stack.push(arr[i]);
                }
            }else{
                System.out.println(arr[i] + "->" + -1);
                stack.push(arr[i]);
            }
        }
    }
}
