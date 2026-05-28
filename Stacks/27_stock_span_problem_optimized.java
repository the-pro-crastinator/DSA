// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// [100, 80, 60, 70, 60, 75, 85]
// stock span for every day
// 1 1 1 2 1 4 6

import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        int arr[] = {100,80,60,70,60,75,85};
        for(int i=0;i<arr.length;i++){
            if(!stack.isEmpty()){
                if(arr[i]<arr[stack.peek()]){
                    System.out.println(1);
                stack.push(i);
                }else{
                    while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]){
                        stack.pop();
                    }
                    if(!stack.isEmpty()){
                        System.out.println(i-stack.peek());
                stack.push(i);
                    }else{
                        System.out.println(i+1);
                stack.push(i);
                    }
                }
            }else{
                System.out.println(1);
                stack.push(i);
            }
        }
    }
}
